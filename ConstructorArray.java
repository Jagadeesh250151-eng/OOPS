class Numbers {
    int[] values;

    Numbers(int[] v) {
        values = v;
    }

    void display() {
        for (int n : values) {
            System.out.println(n);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};

        Numbers n = new Numbers(data);
        n.display();
    }
}
