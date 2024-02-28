package game;

public class Player
{
    private VARIANTS choice;
    private String name;

    public Player() {
        this.name = "bot";
        this.choice = VARIANTS.PAPER;
    }

    public Player(VARIANTS choice, String name) {
        this.choice = choice;
        this.name = name;
    }
}
