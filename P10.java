// Program to perform mathematical operations using inheritance

class AddSub {

    int num1, num2;

    AddSub(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    void sub() {
        System.out.println("Subtraction: " + (num1 - num2));
    }
}

class MulDiv extends AddSub {

    MulDiv(int a, int b) {
        super(a, b);
    }

    void mul() {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    void div() {
        if (num2 != 0) {
            System.out.println("Division: " + ((double) num1 / num2)); 
        }else {
            System.out.println("Division by zero not allowed!");
        }
    }
}

public class P10 {

    public static void main(String[] args) {
        MulDiv calc = new MulDiv(20, 5);
        calc.add();
        calc.sub();
        calc.mul();
        calc.div();
    }
}
