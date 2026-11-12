
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        for(String s : a) {
            System.out.print(new StringBuilder(s).reverse() + " ");
        }
    }
}
