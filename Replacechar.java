import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        System.out.print(str.replace(ch1, ch2));
    }
}
