
import java.io.*;

class Student {

    String usn;
    String name;
    String branch;
    String phone;
    double percentage;

    Student(String usn, String name, String branch, String phone, double percentage) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
        this.percentage = percentage;
    }
}

public class P11 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the number of students:");
        int n = Integer.parseInt(dis.readLine());

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = dis.readLine();
            System.out.print("Name: ");
            String name = dis.readLine();
            System.out.print("Branch: ");
            String branch = dis.readLine();
            System.out.print("Phone: ");
            String phone = dis.readLine();
            System.out.print("Percentage: ");
            double percentage = Double.parseDouble(dis.readLine());

            students[i] = new Student(usn, name, branch, phone, percentage);
        }
        System.out.printf("%-10s %-15s %-10s %-15s %-10s\n", "USN", "Name", "Branch", "Phone", "Percentage");

        for (int i = 0; i < n; i++) {
            Student s = students[i];
            System.out.printf("%-10s %-15s %-10s %-15s %-10.2f\n", s.usn, s.name, s.branch, s.phone, s.percentage);
        }
    }
}
