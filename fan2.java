class Fan {
    String brand;
    int speed;

    Fan(String b, int s) {
        brand = b;
        speed = s;
    }

    void display() {
        System.out.println("Fan Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Fan f = new Fan("Usha", 5);
        f.display();
    }
}
