package java.entity;
import java.util.Random;

public class Dice {
    Random random = new Random();
    private int eyes;

    public void ThrowDice(){
        this.eyes = this.random.nextInt(6)+1;

    }

    public int getEyes() {
        return eyes;
    }
}
