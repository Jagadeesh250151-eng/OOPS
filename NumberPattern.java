
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int num = j * n - j * (j - 1) / 2 + i + 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
