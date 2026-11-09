
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (s.indexOf(c) != i) {
                System.out.println(c);
                break;
            }
        }
    }
}
