class Laptop {
    String brand;
    int ram;

    Laptop(String b, int r) {
        brand = b;
        ram = r;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop l = new Laptop("Dell", 8);
        l.display();
    }
}
