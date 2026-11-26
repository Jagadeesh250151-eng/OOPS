import java.util.Scanner;

public class Main {

    static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pivot = a[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (a[j] < pivot) {
                    i++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            int temp = a[i + 1];
            a[i + 1] = a[high];
            a[high] = temp;

            int pi = i + 1;

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Original List: ");
        for (int x : a)
            System.out.print(x + " ");

        quickSort(a, 0, n - 1);

        System.out.print("\nSorted List: ");
        for (int x : a)
            System.out.print(x + " ");

        sc.close();
    }
}
