class Transport {
    void fare() {
        System.out.println("Transport fare calculated");
    }
}

class Bus extends Transport {
    @Override
    void fare() {
        System.out.println("Bus fare is Rs. 20");
    }
}

public class Main {
    public static void main(String[] args) {
        Transport t = new Bus();
        t.fare();
    }
}
