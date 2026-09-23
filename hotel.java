class HotelRoom {
    int roomNumber;
    int price;

    HotelRoom(int r, int p) {
        roomNumber = r;
        price = p;
    }

    void display() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price: Rs." + price);
    }
}

public class Main {
    public static void main(String[] args) {
        HotelRoom h = new HotelRoom(205, 1500);
        h.display();
    }
}
