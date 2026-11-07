class Student {
    private int marks = 95;

    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
    }
}
