import java.util.Scanner;

class Factorial {

    int findFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Factorial obj = new Factorial();

        System.out.println(obj.findFactorial(n));
    }
}
