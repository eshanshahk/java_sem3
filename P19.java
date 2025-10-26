
import java.io.*;

class DuplicateNumberException extends Exception {

    String errorMessage;

    DuplicateNumberException(String msg) {
        errorMessage = msg;
    }

    public String getMessage() {
        return errorMessage;
    }
}

class P19 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter how many integers you want to input: ");
        int n = Integer.parseInt(dis.readLine());

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");

        try {
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(dis.readLine());

                // check for duplicates
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        throw new DuplicateNumberException("Duplicate number found: " + arr[i]);
                    }
                }
            }
            System.out.println("All numbers are unique!");
        } catch (DuplicateNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
