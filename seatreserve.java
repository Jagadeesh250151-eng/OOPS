import java.util.Scanner;

public class BusReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] seats = new boolean[10];

        while (true) {

            System.out.println("\n1. View Seats");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                for (int i = 0; i < seats.length; i++) {
                    System.out.println(
                        "Seat " + (i + 1) + ": " +
                        (seats[i] ? "Reserved" : "Available")
                    );
                }

            } else if (choice == 2) {

                System.out.print("Enter seat number: ");
                int seat = sc.nextInt();

                if (seat < 1 || seat > 10) {
                    System.out.println("Invalid seat number");
                } else if (seats[seat - 1]) {
                    System.out.println("Seat already reserved");
                } else {
                    seats[seat - 1] = true;
                    System.out.println("Seat reserved successfully");
                }

            } else if (choice == 3) {

                System.out.print("Enter seat number: ");
                int seat = sc.nextInt();

                if (seat < 1 || seat > 10) {
                    System.out.println("Invalid seat number");
                } else if (!seats[seat - 1]) {
                    System.out.println("Seat is not reserved");
                } else {
                    seats[seat - 1] = false;
                    System.out.println("Reservation cancelled");
                }

            } else if (choice == 4) {

                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
