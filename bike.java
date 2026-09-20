class Bike {
    String brand;
    int mileage;

    Bike(String b, int m) {
        brand = b;
        mileage = m;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike b = new Bike("Yamaha", 45);
        b.display();
    }
}
