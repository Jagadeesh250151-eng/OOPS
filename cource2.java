class Course {
    String name;
    int duration;

    Course(String n, int d) {
        name = n;
        duration = d;
    }

    void display() {
        System.out.println("Course: " + name);
        System.out.println("Duration: " + duration + " months");
    }
}

public class Main {
    public static void main(String[] args) {
        Course c = new Course("Java Programming", 6);
        c.display();
    }
}
