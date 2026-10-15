public class Main {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int key = 30;
        int position = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                position = i + 1;
                break;
            }
        }

        if (position != -1)
            System.out.println("Found at Position " + position);
        else
            System.out.println("Not Found");
    }
}
