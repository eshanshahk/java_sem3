
import java.io.IOException;

//Write a program to send the name and surname of a student through command line arguments and print a welcome message for the student
class P3 {

    public static void main(String[] args) throws IOException {
        String firstName = args[0];
        String surName = args[1];
        System.err.println("Welcome " + firstName + " " + surName + " to Java Program 3");
    }
}
