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

public class Exercise9 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "R. Kumar");
        Book b2 = new Book("Data Structures", "S.Menon");
        Book b3 = new Book("Operating Systems", "A. Verma");

        b1.display();
        b2.display();
        b3.display();
    }
}
