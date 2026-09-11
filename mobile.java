class Mobile {
    String brand;
    int price;

    Mobile(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile("Samsung", 25000);
        m.display();
    }
}
