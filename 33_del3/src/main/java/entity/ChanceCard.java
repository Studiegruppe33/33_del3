package java.entity;

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

            public void deck () {
                Chance[] chanceDeck = new Chance[10];
                chanceDeck[0].chancecard1();
                chanceDeck[1].chancecard2();
                chanceDeck[2].chancecard3();
                chanceDeck[3].chancecard4();
                chanceDeck[4].chancecard5();
                chanceDeck[5].chancecard6();
                chanceDeck[6].chancecard7();
                chanceDeck[7].chancecard8();
                chanceDeck[8].chancecard9();
                chanceDeck[9].chancecard10();
                for (int i = 0; i < chanceDeck.length; i++) {
                    System.out.println(chanceDeck[i]);
                }
            }
        }


