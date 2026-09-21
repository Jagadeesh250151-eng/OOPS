class Employee {
    String name;
    int experience;

    Employee(String n, int e) {
        name = n;
        experience = e;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Suresh", 3);
        e.display();
    }
}
