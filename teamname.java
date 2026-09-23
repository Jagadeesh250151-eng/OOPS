class Team {
    String name;
    int players;

    Team(String n, int p) {
        name = n;
        players = p;
    }

    void display() {
        System.out.println("Team: " + name);
        System.out.println("Players: " + players);
    }
}

public class Main {
    public static void main(String[] args) {
        Team t = new Team("Chennai Team", 11);
        t.display();
    }
}
