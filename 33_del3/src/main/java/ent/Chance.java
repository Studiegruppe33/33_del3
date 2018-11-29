package ent;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chance extends Field {

    public Chance(int nummer, String name, int result) {
        super(nummer, name, result);

    }

    private int[] chancecard;


    public void Chance() {
        chancecard = new int[10];
        chancecard[0] = 1;
        chancecard[1] = 2;
        chancecard[2] = 3;
        chancecard[3] = 4;
        chancecard[4] = 5;
        chancecard[5] = 6;
        chancecard[6] = 7;
        chancecard[7] = 8;
        chancecard[8] = 9;
        chancecard[9] = 10;

    }

    public int pullCard() {
        int j = chancecard[0];
        for (int i = 0; i < chancecard.length; i++) {
            chancecard[i] = chancecard[i + 1];
        }
        chancecard[chancecard.length - 1] = j;
        return j;
    }


    public void shufflecard() {
        int position;
        int deck;
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

    @Override
    public void landOnField() {

    }
}









/*

    public void chancecard1() {
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        account.addToScore(2);
    }

    public void chancecard2() {
        System.out.println("Ryk frem til start og modtag 2M!");
        player.setPosition(0);
    }

    public void chancecard3() {

        System.out.println("Gratis Felt!");
        System.out.println("Ryk frem til et orange felt: Hvis det er ledigt, " +
                "får du det gratis! Ellers skal du betale leje til ejeren ");
        System.out.println("Tryk 1 for at vælge Skaterparken eller tryk 2 for Swimmingpoolen");
        while(true){
            System.out.println("Tryk 1 eller 2");
            int fieldChoice = scanner.nextInt();
            if(fieldChoice == 1){
                player.setPosition(10);
            }else if(fieldChoice == 2){
                player.setPosition(11);
            }

        }
    }

    public void chancecard4() {
        System.out.println("Du har spist for meget slik. Betal M2 til banken");
        account.addToScore(-2);
    }

    public void chancecard5() {
        System.out.println("Tryk 1 for at rykke 1 felt frem eller tryk 2 for at tage et chancekort mere");

        while (true) {
            System.out.println("Tryk 1 eller 2");
            int fieldChoice = scanner.nextInt();
            if (fieldChoice == 1) {
                player.setPosition(player.getPosition() + 1);

            } else if (fieldChoice == 2) {
                player.setPosition(player.getPosition());
            }
        }
    }
    public void chancecard6() {
        System.out.println("Gratis Felt!");
        System.out.println("Ryk frem til et orange eller grønt felt: Hvis det er ledigt, " +
                "får du det gratis! Ellers skal du betale leje til ejeren ");
        System.out.println("Tryk 1 for at vælge Skaterparken, tryk 2 for Swimmingpoolen, tryk 3 for Bowlinghallen eller tryk 4 for Zoologiskhave ");
        while (true) {
            System.out.println("Tryk 1,2,3 eller 4");
            int fieldChoice = scanner.nextInt();
            if (fieldChoice == 1) {
                player.setPosition(10);
            } else if (fieldChoice == 2) {
                player.setPosition(11);
            } else if (fieldChoice == 3) {
                player.setPosition(19);
            } else if (fieldChoice == 4) {
                player.setPosition(20);
            }

        }
    }

        public void chancecard7() {
            System.out.println("Gratis Felt!");
            System.out.println("Ryk frem til et lyseblåt felt: Hvis det er ledigt, " +
                    "får du det gratis! Ellers skal du betale leje til ejeren ");
            System.out.println("Tryk 1 for at vælge Slikbutikken eller tryk 2 for Iskiosken");
            while(true){
                System.out.println("Tryk 1 eller 2");
                int fieldChoice = scanner.nextInt();
                if(fieldChoice == 1){
                    player.setPosition(5);
                }else if(fieldChoice == 2){
                    player.setPosition(6);
                }

            }
    }

    public void chancecard8() {
        System.out.println("Ryk frem til Strandpromenaden");
        player.setPosition(24);
    }

    public void chancecard9() {
            System.out.println("Gratis Felt!");
            System.out.println("Ryk frem til et pink eller mørkeblåt felt: Hvis det er ledigt, " +
                    "får du det gratis! Ellers skal du betale leje til ejeren ");
            System.out.println("Tryk 1 for at vælge Museet, tryk 2 for Biblioteket, tryk 3 for Vandlandet eller tryk 4 for Strandpromenaden ");
            while (true) {
                System.out.println("Tryk 1,2,3 eller 4");
                int fieldChoice = scanner.nextInt();
                if (fieldChoice == 1) {
                    player.setPosition(8);
                } else if (fieldChoice == 2) {
                    player.setPosition(9);
                } else if (fieldChoice == 3) {
                    player.setPosition(23);
                } else if (fieldChoice == 4) {
                    player.setPosition(24);
                }

            }
        }

    public void chancecard10() {
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        account.addToScore(2);

    }

    @Override
    public void landOnField() {
        //Trækkes kort
        //fund metode det skal udføres
        //Udfør metode
    }
    // i stedet for at lave random objekt: kald super.addToScore eller super.landOnField.
}
*/
