class Student {
    String name;
    int rollNumber;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Arjun";
        s.rollNumber = 101;

        System.out.println("Name: " + s.name);
        System.out.println("Roll Number: " + s.rollNumber);
    }
}
