public class Main {
    public static void main(String[] args) {
        int n = 18, temp = n, sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (temp % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}
