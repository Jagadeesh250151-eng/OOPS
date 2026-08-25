import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder(str.substring(0, N));

        System.out.print(sb.reverse());
    }
}
