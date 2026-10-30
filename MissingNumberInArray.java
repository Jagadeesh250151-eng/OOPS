public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        int n = 6;
        int sum = 0;

        for (int num : a) {
            sum += num;
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;

        System.out.println("Missing Number = " + missing);
    }
}
