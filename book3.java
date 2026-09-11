class Book {
    String name;
    int price;

    Book(String n, int p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println("Book: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Java", 300);
        b.display();
    }
}
