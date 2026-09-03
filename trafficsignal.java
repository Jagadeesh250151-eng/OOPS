import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal color: ");
        String signal = sc.nextLine().toLowerCase();

        switch (signal) {
            case "red":
                System.out.println("STOP");
                break;

            case "yellow":
                System.out.println("GET READY");
                break;

            case "green":
                System.out.println("GO");
                break;

            default:
                System.out.println("Invalid signal");
        }

        sc.close();
    }
}
