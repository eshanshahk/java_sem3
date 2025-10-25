//WRITE A JAVA PROGRAM THAT CHECKS WHETHER A GIVEN STRING IS A PALINDROME OR NOT. EX: MADAM IS A PALINDROME.

import java.io.*;

class P8 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the string!");
        DataInputStream dis = new DataInputStream(System.in);
        String name = dis.readLine();
        name = name.toUpperCase();
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        if (name.equals(rev)) {
            System.out.println(name + " is Palindrome!");
        } else {
            System.out.println(name + " is not a Palindrome!");
        }

    }

}
