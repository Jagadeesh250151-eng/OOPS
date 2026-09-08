class Employee {
    void salary() {
        System.out.println("Employee salary is calculated");
    }
}

class Manager extends Employee {
    @Override
    void salary() {
        System.out.println("Manager salary is 60000");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.salary();
    }
}
