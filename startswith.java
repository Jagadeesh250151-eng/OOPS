import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.startsWith("pan")) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
