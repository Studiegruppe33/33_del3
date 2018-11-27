package ent;
import java.util.Arrays;
import java.util.Random;

/*public class ChanceCard extends Chance{
    public ChanceCard(int number, String name, int result, int card) {
        super(number, name, result);
        this.card = card;
    }

    private int card;
    Account currentAccount;

    ChanceCard chancecard1;
    ChanceCard chancecard2;
    ChanceCard chancecard3;
    ChanceCard chancecard4;
    ChanceCard chancecard5;
    ChanceCard chancecard6;
    ChanceCard chancecard7;
    ChanceCard chancecard8;
    ChanceCard chancecard9;
    ChanceCard chancecard10;

*/

    public class ChanceCard {

        Chance chance;
        private int number;
        Chance[] chanceDeck = new Chance[10];
        public ChanceCard(int number){
        this.number = number;
        }
        public void deck() {
            chanceDeck[0] = new Chance(1);
            chanceDeck[1] = new Chance(2);
            chanceDeck[2] = new Chance(3);
            chanceDeck[3] = new Chance(4);
            chanceDeck[4] = new Chance(5);
            chanceDeck[5] = new Chance(6);
            chanceDeck[6] = new Chance(7);
            chanceDeck[7] = new Chance(8);
            chanceDeck[8] = new Chance(9);
            chanceDeck[9] = new Chance(10);


        }

        /* public Chance getChanceCard(){
            Random random=new Random();
            int i = random.nextInt(chanceDeck.length);
            return chanceDeck[i];
        }*/
        public Chance pullCard() {
            Chance pull = chanceDeck[0];
            for (int i = 0; i < chanceDeck.length; i++) {
            chanceDeck[i]=chanceDeck[i+1];
            }
            chanceDeck[chanceDeck.length-1]=pull;
            return pull;
        }

            public void shufflecard(){
            int position;
            Chance deck;
            Random random = new Random();
            for ( int i = chanceDeck.length-1;i>0;i--){
                position = random.nextInt(i+1);
                deck=chanceDeck[position];
                chanceDeck[position]=chanceDeck[i];
                chanceDeck[i] = deck;
            }

        }

        @Override
        public String toString() {
            return "ChanceCard{" +
                    "chanceDeck=" + Arrays.toString(chanceDeck) +
                    '}';

        }
        }


