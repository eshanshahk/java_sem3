//Reverse of Array

import java.io.*;

class P9 {

    public static void main(String[] args) throws IOException {
        System.err.println("Enter the limit");
        DataInputStream dis = new DataInputStream(System.in);
        int limit = Integer.parseInt(dis.readLine());
        int[] arr = new int[limit];
        for (int i = 0; i < limit; i++) {
            arr[i] = Integer.parseInt(dis.readLine());
        }

        System.err.println("Reversed Array");
        for (int i = limit - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
