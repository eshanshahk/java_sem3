//Write a program to print the square of a number passed through command line arguments.

import java.io.*;

class P2 {

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(args[0]);
        int square = a * a;
        System.err.println("Square of " + a + " is " + square);
    }
}
