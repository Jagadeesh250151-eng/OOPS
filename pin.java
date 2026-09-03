import java.util.Scanner;

public class PinSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 2468;
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Access Granted!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong PIN. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked!");
        }

        sc.close();
    }
}
