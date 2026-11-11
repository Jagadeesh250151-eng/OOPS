
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        for(char c : s.toCharArray())
            if(r.indexOf(c) == -1)
                r += c;
        System.out.println(r);
    }
}
