import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(
            Arrays.asList(10, 20, 30, 40));

        Set<Integer> b = new TreeSet<>(
            Arrays.asList(30, 40, 50, 60));

        a.retainAll(b);

        System.out.println("Intersection = " + a);
    }
}
