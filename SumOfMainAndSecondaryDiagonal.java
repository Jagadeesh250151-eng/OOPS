
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int s1 = 0, s2 = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s1 += a[i][i];
            s2 += a[i][n - 1 - i];
        }

        System.out.println(Math.abs(s1 - s2));
    }
}
