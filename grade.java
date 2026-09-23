class Student {
    String name;
    char grade;

    Student(String n, char g) {
        name = n;
        grade = g;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Arun", 'A');
        s.display();
    }
}
