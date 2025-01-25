import java.util.*;

class Indoor {
    private String[] players;

    public Indoor() {
        this.players = new String[]{"Player1", "Player2", "Player3"};
    }

    public Indoor(String[] players) {
        this.players = players;
    }

    public void display() {
        System.out.println("Indoor Game Players:");
        for (String player : players) {
            System.out.println(player);
        }
    }
}

class Outdoor {
    private String[] players;

    public Outdoor() {
        this.players = new String[]{"PlayerA", "PlayerB", "PlayerC"};
    }

    public Outdoor(String[] players) {
        this.players = players;
    }

    public void display() {
        System.out.println("Outdoor Game Players:");
        for (String player : players) {
            System.out.println(player);
        }
    }
}

public class setbq5 {
    public static void main(String[] args) {
        Indoor indoorGame = new Indoor();
        Outdoor outdoorGame = new Outdoor();

        indoorGame.display();
        outdoorGame.display();

        String[] customIndoorPlayers = {"Alice", "Bob", "Charlie"};
        String[] customOutdoorPlayers = {"Xander", "Yara", "Zane"};

        Indoor customIndoorGame = new Indoor(customIndoorPlayers);
        Outdoor customOutdoorGame = new Outdoor(customOutdoorPlayers);

        customIndoorGame.display();
        customOutdoorGame.display();
    }
}
