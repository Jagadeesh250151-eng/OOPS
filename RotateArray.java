import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int k = 2;
        int n = a.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = a[i];
        }

        System.out.println("Rotated Array = "
                           + Arrays.toString(rotated));
    }
}
