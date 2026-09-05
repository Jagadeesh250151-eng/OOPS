class BankAccount {
    private int balance = 10000;

    void showBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.showBalance();
    }
}
