//Write a Java program that displays the number of characters, lines and words in a text.

import java.io.*;

class P12 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter text(Press Enter on an empty line to finish!):");
        int wordCount = 0, lineCount = 0, charCount = 0;

        while (true) {
            String para = dis.readLine();
            if (para.length() == 0) {
                break;
            }
            lineCount++;
            charCount += para.length();
            String Words[] = para.trim().split("\\s+");
            wordCount += Words.length;
        }
        System.out.println("Lines = " + lineCount);
        System.out.println("Characters = " + charCount);
        System.out.println("Words = " + wordCount);
    }
}