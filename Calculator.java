class Calculator {

    Calculator() {
        System.out.println("Calculator Created");
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Integer Sum: " + c.add(10, 20));
        System.out.println("Decimal Sum: " + c.add(5.5, 2.5));
    }
}
