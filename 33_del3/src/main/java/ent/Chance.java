package ent;

import java.util.Scanner;

public class Chance extends Field {
    public Chance(int nummer) {
        super(1, "chance", 1);
    }
    Scanner scanner = new Scanner(System.in);
    // dan objekter af hver chanceklasse og inddel dem i et array, som starter tilfældigt
    // herfra lægges øverste kort nederst i arrayet, så alle rykker en gang ned.

    Account account;
    Player player;



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

