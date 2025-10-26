
import java.io.*;

class UnderAge extends Exception {

    int age;

    UnderAge(int a) {
        age = a;
    }

    public String toString() {
        return "Under Age: " + age;
    }
}

class exceptionDemo {

    static void test(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);
        } else {
            System.out.println("You are eligible! Age: " + age);
        }
    }

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(dis.readLine());
        try {
            test(age);
        } catch (UnderAge e) {
            System.out.println(e);
        }
    }
}
