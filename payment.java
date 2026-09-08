class Payment {
    void pay() {
        System.out.println("Payment is processing");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
    }
}
