class Bus {
    int busNumber;
    String route;

    Bus(int n, String r) {
        busNumber = n;
        route = r;
    }

    void display() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Route: " + route);
    }
}

public class Main {
    public static void main(String[] args) {
        Bus b = new Bus(25, "Chennai - Tambaram");
        b.display();
    }
}
