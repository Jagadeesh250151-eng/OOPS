
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(char c : s.toCharArray()) {
            if("aeiou".indexOf(c) == -1)
                System.out.print(c);
        }
    }
}
