class Mobile {
    String brand;
    int battery;

    Mobile(String b, int bat) {
        brand = b;
        battery = bat;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Battery: " + battery + " mAh");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile("OnePlus", 5000);
        m.display();
    }
}
