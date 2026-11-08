import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 1, 2, 4};
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int n : a)
            map.put(n, map.getOrDefault(n, 0) + 1);

        System.out.println(map);
    }
}
