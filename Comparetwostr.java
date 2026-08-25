import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
