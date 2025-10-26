/*WRITE A JAVA PROGRAM TO CREATE A CLASS EMPLOYEE WITH A METHOD CALLED CALCULATESALARY().
CREATE TWO SUBCLASSES MANAGER AND PROGRAMMER. IN EACH SUBCLASS, OVERRIDE THE CALCULATESALARY()
 METHOD TO CALCULATE AND RETURN THE SALARY BASED ON THEIR SPECIFIC ROLES. */
import java.io.*;

class Employee {

    double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {

    double calculateSalary() {
        double baseSalary = 40000;
        double bonus = 15000;
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {

    double calculateSalary() {
        double baseSalary = 30000;
        double overTime = 10000;
        return baseSalary + overTime;
    }
}

class P14 {

    public static void main(String[] args) throws IOException {
        Manager M = new Manager();
        Programmer P = new Programmer();

        System.out.println("Manager : " + M.calculateSalary());
        System.out.println("Programmer : " + P.calculateSalary());
    }
}
