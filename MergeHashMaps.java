import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> a = new LinkedHashMap<>();
        Map<String, String> b = new LinkedHashMap<>();

        a.put("Name", "Arun");
        a.put("Age", "19");

        b.put("City", "Chennai");
        b.put("Course", "CSE");

        a.putAll(b);

        System.out.println(a);
    }
}
