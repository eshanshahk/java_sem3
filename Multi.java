import java.io.DataInputStream;
import java.io.IOException;

public class Multi {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter number of rows of first matrix: ");
        int r1 = Integer.parseInt(dis.readLine());
        System.out.print("Enter number of columns of first matrix: ");
        int c1 = Integer.parseInt(dis.readLine());

        System.out.print("Enter number of rows of second matrix: ");
        int r2 = Integer.parseInt(dis.readLine());
        System.out.print("Enter number of columns of second matrix: ");
        int c2 = Integer.parseInt(dis.readLine());

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = Integer.parseInt(dis.readLine());
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = Integer.parseInt(dis.readLine());
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
