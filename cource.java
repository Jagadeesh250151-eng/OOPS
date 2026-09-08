class Course {
    void details() {
        System.out.println("Course details");
    }
}

class CSE extends Course {
    @Override
    void details() {
        System.out.println("CSE - Computer Science and Engineering");
    }
}

public class Main {
    public static void main(String[] args) {
        Course c = new CSE();
        c.details();
    }
}
