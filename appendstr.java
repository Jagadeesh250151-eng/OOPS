import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        sb.append(str3);

        System.out.print(sb.toString());
    }
}
