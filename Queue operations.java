import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int q[] = new int[100];
        int front = 0, rear = -1;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            q[++rear] = sc.nextInt();
        }

        System.out.println("Queue Elements:");
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");

        System.out.print("\nEnter element to insert: ");
        q[++rear] = sc.nextInt();

        System.out.println("After Insertion:");
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");

        front++;

        System.out.println("\nAfter Deletion:");
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");

        sc.close();
    }
}
