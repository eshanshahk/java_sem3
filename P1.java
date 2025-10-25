//Write a program to read two numbers from user and print their product.

import java.io.*;

class P1 {

    public static void main(String argc[]) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter two numbers!");
        int num1 = Integer.parseInt(dis.readLine());
        int num2 = Integer.parseInt(dis.readLine());
        int product = num1 * num2;

        System.out.println("The Product of two numbers is " + product);
    }
}
