class Car {
    String model;
    int year;

    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Honda City", 2024);
        c.display();
    }
}
