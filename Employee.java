import java.io.*;
import java.sql.*;  

public class Employee {  

    public static void main(String args[]) throws IOException {  
        int ch, upc;  
        int no, sal;  
        String name;  

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

        try {  
            Class.forName("org.postgresql.Driver");  
        } catch (ClassNotFoundException e) {  
            System.out.println("Unable to load driver");  
            return;  
        }  

        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost/empl", "postgres", "concord");
             Statement stmt = con.createStatement()) {

            System.out.println("\n.....Current Records....\n");  
            System.out.println("ENO\tENAME\tSALARY\n");  

            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");  
            while (rs.next()) {       
                System.out.println(rs.getInt("eno") + "\t" + rs.getString("ename") + "\t" + rs.getInt("salary"));  
            }  

            do {     
                System.out.println("\nMENU");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");  
                ch = Integer.parseInt(br.readLine());  

                switch (ch) {  
                    case 1:  
                        System.out.println("Enter employee number, name and salary:");      
                        no = Integer.parseInt(br.readLine());  
                        name = br.readLine();  
                        sal = Integer.parseInt(br.readLine());  
                        stmt.executeUpdate("INSERT INTO employee(eno, ename, salary) VALUES(" + no + ", '" + name + "', " + sal + ")");  
                        System.out.println("Record inserted");  
                        break;  

                    case 2:  
                        System.out.print("Enter employee number of the record to update: ");  
                        no = Integer.parseInt(br.readLine());  
                        System.out.println("Enter new name and salary:");  
                        name = br.readLine();  
                        sal = Integer.parseInt(br.readLine());  

                        try {  
                            con.setAutoCommit(false);  
                            upc = stmt.executeUpdate("UPDATE employee SET ename='" + name + "', salary=" + sal + " WHERE eno=" + no);  
                            if (upc != 0) {  
                                con.commit();  
                                System.out.println("Record updated");  
                            } else {  
                                System.out.println("No such record exists");  
                            }  
                        } catch (SQLException e) {  
                            System.out.println("Exception occurred: " + e + "\nRecord not updated");  
                            con.rollback();  
                        }  
                        break;  

                    case 3:  
                        System.out.print("Enter employee number of the record you want to delete: ");  
                        no = Integer.parseInt(br.readLine());  

                        try {  
                            con.setAutoCommit(false);  
                            upc = stmt.executeUpdate("DELETE FROM employee WHERE eno=" + no);  
                            if (upc != 0) {  
                                con.commit();  
                                System.out.println("Record deleted");  
                            } else {  
                                System.out.println("No such record exists");  
                            }  
                        } catch (SQLException e) {  
                            System.out.println("Exception occurred: " + e + "\nRecord not deleted");  
                            con.rollback();  
                        }  
                        break;  

                    case 4:  
                        ResultSet rsl = stmt.executeQuery("SELECT * FROM employee");  
                        System.out.println("ENO\tENAME\tSALARY\n");  
                        while (rsl.next()) {       
                            System.out.println(rsl.getInt("eno") + "\t" + rsl.getString("ename") + "\t" + rsl.getInt("salary"));  
                        }  
                        rsl.close();  
                        break;  

                    case 5:  
                        System.out.println("Exiting...");  
                        System.exit(0);  

                    default:  
                        System.out.println("Enter a valid choice");  
                }  
            } while (ch != 5);  

            rs.close();  

        } catch (SQLException e) {  
            System.out.println("Connection failed: " + e.getMessage());  
        }  
    }  
}
