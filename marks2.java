class Marks {
    String name;
    int mark;

    Marks(String n, int m) {
        name = n;
        mark = m;
    }

    void display() {
        System.out.println("Student: " + name);
        System.out.println("Mark: " + mark);
    }
}

public class Main {
    public static void main(String[] args) {
        Marks m = new Marks("Vijay", 85);
        m.display();
    }
}
