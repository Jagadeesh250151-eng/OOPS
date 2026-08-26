import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.endsWith("ion")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
