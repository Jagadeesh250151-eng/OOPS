
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String w1 = sc.nextLine();
        String w2 = sc.nextLine();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[i].equals(w1) && s[j].equals(w2)) {
                    min = Math.min(min, Math.abs(i - j));
                }
            }
        }

        System.out.println(min);
    }
}
