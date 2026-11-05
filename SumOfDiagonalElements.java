public class Main {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += a[i][i];
        }

        System.out.println("Diagonal Sum: " + sum);
    }
}
