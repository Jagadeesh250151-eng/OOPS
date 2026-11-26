import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int id[] = new int[n];
        String name[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Product ID: ");
            id[i] = sc.nextInt();

            System.out.print("Enter Product Name: ");
            name[i] = sc.next();
        }

        System.out.print("Enter Product ID to search: ");
        int key = sc.nextInt();

        // Linear Search
        System.out.println("\nLinear Search:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (id[i] == key) {
                System.out.println("Product Found: " + name[i]);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Product Not Found");

        // Sorting for Binary Search
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (id[i] > id[j]) {
                    int temp = id[i];
                    id[i] = id[j];
                    id[j] = temp;

                    String t = name[i];
                    name[i] = name[j];
                    name[j] = t;
                }
            }
        }

        // Binary Search
        System.out.println("\nBinary Search:");

        int low = 0, high = n - 1;
        found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (id[mid] == key) {
                System.out.println("Product Found: " + name[mid]);
                found = true;
                break;
            } else if (id[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found)
            System.out.println("Product Not Found");

        sc.close();
    }
}
