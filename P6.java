//Write a java program to multiply two given matrices.

import java.io.*;

class P6 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the no of rows and columns of first matrix!");
        int row1 = Integer.parseInt(dis.readLine());
        int col1 = Integer.parseInt(dis.readLine());

        System.out.println("Enter the no of rows and columns of second matrix!");
        int row2 = Integer.parseInt(dis.readLine());
        int col2 = Integer.parseInt(dis.readLine());

        if (col1 != row2) {
            System.out.println("Matrix Multiplication not Possible!");
            return;
        }

        int[][] a = new int[row1][col1];
        int[][] b = new int[row2][col2];
        int[][] result = new int[row1][col2];

        System.out.println("Enter the elements of first matrix!");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = Integer.parseInt(dis.readLine());
            }
        }
        System.out.println("Enter the elements of second matrix!");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = Integer.parseInt(dis.readLine());
            }
        }

        System.out.println("Result");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
