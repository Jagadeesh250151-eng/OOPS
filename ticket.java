class Ticket {
    String movie;
    int price;

    Ticket(String m, int p) {
        movie = m;
        price = p;
    }

    void display() {
        System.out.println("Movie: " + movie);
        System.out.println("Ticket Price: Rs." + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Ticket t = new Ticket("Avatar", 250);
        t.display();
    }
}
