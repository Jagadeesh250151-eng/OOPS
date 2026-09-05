class Employee {
    String name;

    void display() {
        System.out.println("Employee: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Rahul";
        e2.name = "Kavin";

        e1.display();
        e2.display();
    }
}
