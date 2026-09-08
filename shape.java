class Shape {
    void area() {
        System.out.println("Calculating area");
    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of circle = 78.5");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
