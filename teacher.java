class Teacher {
    String name;
    String subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }

    void display() {
        System.out.println("Teacher: " + name);
        System.out.println("Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Meena", "Physics");
        t.display();
    }
}
