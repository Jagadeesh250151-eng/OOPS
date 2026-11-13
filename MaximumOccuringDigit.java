
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0, ans = 0;

        for(char c = '0'; c <= '9'; c++) {
            int count = 0;
            for(char d : s.toCharArray())
                if(c == d) count++;

            if(count > max) {
                max = count;
                ans = c - '0';
            }
        }
        System.out.println(ans);
    }
}
