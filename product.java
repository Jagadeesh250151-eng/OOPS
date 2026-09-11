class Product {
    int id;
    String name;

    Product(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product(101, "Keyboard");
        p.display();
    }
}
