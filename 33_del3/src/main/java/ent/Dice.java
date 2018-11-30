package ent;
import java.util.Random;

public class Dice {
    Random random = new Random();
    private int eyes;


    public int ThrowDice(){
        this.eyes = this.random.nextInt(6)+1;
return eyes;
    }

    public int getEyes() {
        return eyes;
    }
}
