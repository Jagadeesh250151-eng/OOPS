class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "R. Kumar");

        System.out.println("Before update:");
        book.display();

        book.title = "Advanced Java";

        System.out.println("After update:");
        book.display();
    }
}
