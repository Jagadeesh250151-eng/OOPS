
import java.util.*;

public class Main {
    static boolean isPal(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0, j = s.length() - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }

        if (i >= j) {
            System.out.println(s.charAt(0));
        } else if (isPal(s, i + 1, j)) {
            System.out.println(s.charAt(i));
        } else {
            System.out.println(s.charAt(j));
        }
    }
}
