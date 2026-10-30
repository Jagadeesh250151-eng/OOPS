import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
