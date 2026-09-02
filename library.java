import java.util.ArrayList;
import java.util.Scanner;

class Book {

    String title;
    boolean borrowed;

    Book(String title) {
        this.title = title;
        this.borrowed = false;
    }
}

public class DigitalLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Java Programming"));
        books.add(new Book("Python Basics"));
        books.add(new Book("Data Structures"));

        while (true) {

            System.out.println("\n1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                for (Book book : books) {
                    System.out.println(
                        book.title + " - " +
                        (book.borrowed ? "Borrowed" : "Available")
                    );
                }

            } else if (choice == 2) {

                System.out.print("Enter book title: ");
                String title = sc.nextLine();

                boolean found = false;

                for (Book book : books) {

                    if (book.title.equalsIgnoreCase(title)) {
                        found = true;

                        if (!book.borrowed) {
                            book.borrowed = true;
                            System.out.println("Book borrowed");
                        } else {
                            System.out.println("Book already borrowed");
                        }
                    }
                }

                if (!found) {
                    System.out.println("Book not found");
                }

            } else if (choice == 3) {

                System.out.print("Enter book title: ");
                String title = sc.nextLine();

                for (Book book : books) {

                    if (book.title.equalsIgnoreCase(title)) {
                        book.borrowed = false;
                        System.out.println("Book returned");
                    }
                }

            } else if (choice == 4) {
                break;
            }
        }

        sc.close();
    }
}
