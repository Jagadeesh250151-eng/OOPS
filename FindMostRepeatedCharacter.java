
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        char ans = ' ';
        for(char c : s.toCharArray()) {
            int count = 0;
            for(char d : s.toCharArray())
                if(c == d) count++;
            if(count > max) {
                max = count;
                ans = c;
            }
        }
        System.out.println(ans);
    }
}
