import java.util.Scanner;

interface Calculator {
    int add(int a, int b);
}

class CalculatorImpl implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        CalculatorImpl obj = new CalculatorImpl();
        System.out.println("Sum = " + obj.add(a, b));
    }
}
