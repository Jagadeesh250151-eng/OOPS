public class Main {
    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println("Square = " + square(n));
        System.out.println("Cube = " + cube(n));
    }
}
