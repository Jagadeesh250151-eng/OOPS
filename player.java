class Player {
    String name;
    int score;

    Player(String n, int s) {
        name = n;
        score = s;
    }

    void display() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
    }
}

public class Main {
    public static void main(String[] args) {
        Player p = new Player("Ravi", 95);
        p.display();
    }
}
