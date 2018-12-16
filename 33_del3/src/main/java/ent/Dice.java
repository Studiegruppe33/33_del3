package ent;
import java.util.Random;

public class Dice {
    //States:
    Random random = new Random();
    private int eyes;

//Metode der kaster terningen og får en random værdi mellem 1-6
    public int ThrowDice(){
        this.eyes = this.random.nextInt(6)+1;
return eyes;
    }

    //Retunere antallet af øjne, så det kan udskrives.
    public int getEyes() {
        return eyes;
    }
}
