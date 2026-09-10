class Order {
    void delivery() {
        System.out.println("Order is being delivered");
    }
}

class FoodOrder extends Order {
    @Override
    void delivery() {
        System.out.println("Food order delivered in 30 minutes");
    }
}

public class Main {
    public static void main(String[] args) {
        Order o = new FoodOrder();
        o.delivery();
    }
}
