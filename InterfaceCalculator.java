import java.util.Scanner;

interface Calculator {
    void calculate();
}

class Addition implements Calculator {
    public void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.calculate();
    }
}
