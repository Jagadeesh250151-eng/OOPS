class Search {

    void find(int[] a, int key) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}

public class Main {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        Search obj = new Search();

        obj.find(a, 30);
    }
}
