public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int sum = 0;

        for (int n : a) {
            sum += n;
        }

        System.out.println("Sum: " + sum);
    }
}
