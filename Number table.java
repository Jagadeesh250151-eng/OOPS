class NumberTable {
    int number;

    NumberTable(int n) {
        number = n;
    }

    void display() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberTable n = new NumberTable(7);
        n.display();
    }
}
