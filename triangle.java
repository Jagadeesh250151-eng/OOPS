class Triangle {
    double base;
    double height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(10, 8);
        t.area();
    }
}
