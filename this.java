class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000);
        p.display();
    }
}
