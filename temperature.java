class Temperature {
    double celsius;

    Temperature(double c) {
        celsius = c;
    }

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}

public class Main {
    public static void main(String[] args) {
        Temperature t = new Temperature(25);
        t.convert();
    }
}
