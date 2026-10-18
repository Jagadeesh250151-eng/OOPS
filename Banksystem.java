
import java.util.Scanner;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class BankAccount implements Bank {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance += amount;
            System.out.println("Deposit successful");
            checkBalance();
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
            checkBalance();
        }
    }

    public void checkBalance() {
        System.out.printf("Balance = %.2f%n", balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Invalid initial balance");
            sc.close();
            return;
        }

        Bank bank = new BankAccount(balance);
        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    bank.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdraw = sc.nextDouble();
                    bank.withdraw(withdraw);
                    break;

                case 3:
                    bank.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
