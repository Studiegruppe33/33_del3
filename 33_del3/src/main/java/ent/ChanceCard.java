package ent;
import java.util.Arrays;
import java.util.Random;

/*public class ChanceCard extends Chance{
    public ChanceCard(int number, String name, int result, int card) {
        super(number, name, result);
        this.card = card;
    }*/

public class ChanceCard {


    private  String[] chancecard;

    public void Chance() {
        chancecard = new String[10];
        chancecard[0] = "Chance 1";
        chancecard[1] = "Chance 2";
        chancecard[2] = "Chance 3";
        chancecard[3] = "Chance 4";
        chancecard[4] = "Chance 5";
        chancecard[5] = "Chance 6";
        chancecard[6] = "Chance 7";
        chancecard[7] = "Chance 8";
        chancecard[8] = "Chance 9";
        chancecard[9] = "Chance 10";

    }

    public Field pullCard() {
        String pullCard = chancecard[0];
        for (int i = 0; i < chancecard.length; i++) {
            chancecard[i] = chancecard[i + 1];
        }
        chancecard[chancecard.length - 1] = pullCard;
        return pullCard;
    }

    public void shufflecard() {
        int position;
        String deck;
        Random random = new Random();
        for (int i = chancecard.length - 1; i > 0; i--) {
            position = random.nextInt(i + 1);
            deck = chancecard[position];
            chancecard[position] = chancecard[i];
            chancecard[i] = deck;
        }

    }

    @Override
    public String toString() {
        return "ChanceCard{" +
                "chanceDeck=" + Arrays.toString(chancecard) +
                '}';

    }
}
