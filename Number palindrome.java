public class Main {
    public static void main(String[] args) {
        int n = 1221;
        int temp = n, reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (temp == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome");
    }
}
