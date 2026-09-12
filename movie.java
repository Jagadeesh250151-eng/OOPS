class Movie {
    String title;
    int year;

    Movie(String t, int y) {
        title = t;
        year = y;
    }

    void display() {
        System.out.println("Movie: " + title);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Movie m = new Movie("Leo", 2023);
        m.display();
    }
}
