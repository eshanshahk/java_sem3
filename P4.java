//WRITE A JAVA PROGRAM TO FIND THE LARGEST NUMBER OUT OF N NATURAL NUMBERS.

import java.io.*;

class P4 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.err.println("Enter the total no of natural numbers!");
        int n = Integer.parseInt(dis.readLine());
        int largest = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(dis.readLine());
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is " + largest);

    }
}
