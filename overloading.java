class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Two numbers: " + c.add(10, 20));
        System.out.println("Three numbers: " + c.add(10, 20, 30));
    }
}
