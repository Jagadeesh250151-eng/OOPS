import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 40};

        ArrayList<Integer> unique = new ArrayList<>();

        for (int n : numbers) {
            if (!unique.contains(n)) {
                unique.add(n);
            }
        }

        System.out.println("Without Duplicates = " + unique);
    }
}
