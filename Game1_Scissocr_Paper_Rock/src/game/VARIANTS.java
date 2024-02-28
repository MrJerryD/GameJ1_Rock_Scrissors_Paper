package game;
import java.util.Random;


public enum VARIANTS
{
    SCISSORS,
    ROCK,
    PAPER;

    private VARIANTS getRandomChoice() {
        Random random = new Random();
        VARIANTS[] values = VARIANTS.values();
        return values[random.nextInt(values.length)];
    }
}
