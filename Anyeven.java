import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % 2 == 0 || B % 2 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
