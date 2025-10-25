
import java.io.*;

public class P5 {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void fibonacciNonRecursive(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci (Non-Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static long factorialNonRecursive(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Enter number of terms for Fibonacci: ");
        int fibTerms = Integer.parseInt(dis.readLine());

        fibonacciNonRecursive(fibTerms);

        System.out.print("Fibonacci (Recursive): ");
        for (int i = 0; i < fibTerms; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        System.out.print("Enter a number for Factorial: ");
        int num = Integer.parseInt(dis.readLine());

        System.out.println("Factorial (Non-Recursive): " + factorialNonRecursive(num));
        System.out.println("Factorial (Recursive): " + factorialRecursive(num));
    }
}
