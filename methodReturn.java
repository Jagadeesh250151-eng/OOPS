class Rectangle {
    int length = 10;
    int width = 5;

    int calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        System.out.println("Length: " + r.length);
        System.out.println("Width: " + r.width);
        System.out.println("Area: " + r.calculateArea());
    }
}
