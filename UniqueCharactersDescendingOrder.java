
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeSet<Character> set = new TreeSet<>(Collections.reverseOrder());
        for(char c : s.toCharArray())
            set.add(c);
        for(char c : set)
            System.out.print(c);
    }
}
