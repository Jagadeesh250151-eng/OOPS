public class Main {
    public static void main(String[] args) {
        double price = 1000;
        double discount = 10;

        double amount = price - (price * discount / 100);

        System.out.println("Final Price = " + amount);
    }
}
