import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        int Y = sc.nextInt();
        
        if (X % 2 != 0 && Y % 2 != 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
