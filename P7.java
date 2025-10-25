//Sorting Names in Ascending Order

import java.io.*;

class P7 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number names to be sorted!");
        DataInputStream dis = new DataInputStream(System.in);
        int num = Integer.parseInt(dis.readLine());
        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = dis.readLine();
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if ((arr[j].compareTo(arr[j + 1]) > 0)) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted list");
        for (int k = 0; k < num; k++) {
            System.out.println(arr[k]);
        }

    }
}
