package ent;

import java.util.Random;
import java.util.Scanner;

public class ChanceCard {
   Account account;
   Player player;
        Scanner scanner = new Scanner(System.in);
        public void card() {
            Random ran = new Random();

            int index=ran.nextInt(10)+1;

            switch (index) {
                case 1:
                    System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
                   account.addToScore(2);
                    break;
                case 2:
                    System.out.println("Ryk frem til start og modtag 2M!");
                   player.setPosition(0);
                    break;
                case 3:
                    System.out.println("Gratis Felt!");
                    System.out.println("Ryk frem til et orange felt: Hvis det er ledigt, " +
                            "får du det gratis! Ellers skal du betale leje til ejeren ");
                    System.out.println("Tryk 1 for at vælge Skaterparken eller tryk 2 for Swimmingpoolen");
                    while (true) {
                        System.out.println("Tryk 1 eller 2");
                        int fieldChoice = scanner.nextInt();
                        if (fieldChoice == 1) {
                           player.setPosition(10);
                           break;
                        } else if (fieldChoice == 2) {
                            player.setPosition(11);
                        break;}

                    }
                case 4:
                    System.out.println("Du har spist for meget slik. Betal M2 til banken");
                    account.addToScore(-2);
                    break;

                case 5:
                    System.out.println("Tryk 1 for at rykke 1 felt frem eller tryk 2 for at tage et chancekort mere");

                    while (true) {
                        System.out.println("Tryk 1 eller 2");
                        int fieldChoice = scanner.nextInt();
                        if (fieldChoice == 1) {
                            player.setPosition(player.getPosition() + 1);

                        break;} else if (fieldChoice == 2) {
                           player.setPosition(player.getPosition());
                       break; }

                    }


                case 6:
                    System.out.println("Gratis Felt!");
                    System.out.println("Ryk frem til et orange eller grønt felt: Hvis det er ledigt, " +
                            "får du det gratis! Ellers skal du betale leje til ejeren ");
                    System.out.println("Tryk 1 for at vælge Skaterparken, tryk 2 for Swimmingpoolen, tryk 3 for Bowlinghallen eller tryk 4 for Zoologiskhave ");
                    while (true) {
                        System.out.println("Tryk 1,2,3 eller 4");
                        int fieldChoice = scanner.nextInt();
                        if (fieldChoice == 1) {
                            player.setPosition(10);
                        break;} else if (fieldChoice == 2) {
                            player.setPosition(11);
                        break;} else if (fieldChoice == 3) {
                            player.setPosition(19);
                        break;} else if (fieldChoice == 4) {
                            player.setPosition(20);
                        break;}


                    }


                case 7:
                    System.out.println("Gratis Felt!");
                    System.out.println("Ryk frem til et lyseblåt felt: Hvis det er ledigt, " +
                            "får du det gratis! Ellers skal du betale leje til ejeren ");
                    System.out.println("Tryk 1 for at vælge Slikbutikken eller tryk 2 for Iskiosken");
                    while (true) {
                        System.out.println("Tryk 1 eller 2");
                        int fieldChoice = scanner.nextInt();
                        if (fieldChoice == 1) {
                            player.setPosition(5);
                        break;} else if (fieldChoice == 2) {
                            player.setPosition(6);
                        break;}


                    }


                case 8:
                    System.out.println("Ryk frem til Strandpromenaden");
                    player.setPosition(24);
                    break;

                case 9:
                    System.out.println("Gratis Felt!");
                    System.out.println("Ryk frem til et pink eller mørkeblåt felt: Hvis det er ledigt, " +
                            "får du det gratis! Ellers skal du betale leje til ejeren ");
                    System.out.println("Tryk 1 for at vælge Museet, tryk 2 for Biblioteket, tryk 3 for Vandlandet eller tryk 4 for Strandpromenaden ");
                    while (true) {
                        System.out.println("Tryk 1,2,3 eller 4");
                        int fieldChoice = scanner.nextInt();
                        if (fieldChoice == 1) {
                            player.setPosition(8);
                       break; } else if (fieldChoice == 2) {
                            player.setPosition(9);
                        break;} else if (fieldChoice == 3) {
                            player.setPosition(23);
                        break;} else if (fieldChoice == 4) {
                            player.setPosition(24);
                        break;}

                    }


                case 10:
                    System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
                    account.addToScore(2);
                    break;

                default:
                    break;
            }


        }

        @Override
        public String toString() {
            return "\n";
        }
    }

