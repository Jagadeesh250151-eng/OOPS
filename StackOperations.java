import java.util.Scanner;

public class Main {
    static int stack[] = new int[100];
    static int top = -1;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int x = sc.nextInt();
            stack[++top] = x;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);

        System.out.print("Enter element to push: ");
        int x = sc.nextInt();
        stack[++top] = x;

        System.out.println("After Push:");
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);

        System.out.print("Enter element to pop: ");
        sc.nextInt();
        if (top >= 0)
            top--;

        System.out.println("After Pop:");
        for (int i = top; i >= 0; i--)
            System.out.println(stack[i]);

        sc.close();
    }
}
