class Bank {
    void interestRate() {
        System.out.println("General bank interest rate");
    }
}

class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI interest rate is 7%");
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.interestRate();
    }
}
