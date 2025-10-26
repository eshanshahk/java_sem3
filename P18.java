//WRITE A JAVA PROGRAM FOR DEMONSTRATING THE DIVIDE BY ZERO EXCEPTION HANDLING.

import java.io.*;

class P18 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter numerator: ");
        int num = Integer.parseInt(dis.readLine());

        System.out.print("Enter denominator: ");
        int den = Integer.parseInt(dis.readLine());

        try {
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

            System.out.println("Program continues after exception handling...");

        }
    }
}
