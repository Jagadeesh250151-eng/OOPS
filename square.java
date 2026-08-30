import java.util.Scanner;

class Calculator {

    int square(int n) {
        return n * n;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Calculator obj = new Calculator();

        System.out.println(obj.square(n));
    }
}
