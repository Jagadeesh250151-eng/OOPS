public class Main {
    public static void main(String[] args) {

        int m = 1;
        int n = 10;
        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of Odd Numbers = " + sum);
    }
}
