class Book {
    String title;

    Book() {
        title = "Java Programming";
    }

    void display() {
        System.out.println("Book Title: " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.display();
    }
}
