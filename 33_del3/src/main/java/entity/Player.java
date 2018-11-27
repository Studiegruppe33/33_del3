package java.entity;
import java.util.Random;
import java.util.Scanner;
public class Player {
    private String name;
    private Account account;
    private int playerAmount;
    private Player players;
    private int position;
    private int playerList;

    int playerTurnCounter = 0;

    Account dogAccount;
    Account catAccount;
    Account carAccount;
    Account shipAccount;
    Account xAccount;

    // metode der vælger 2-4 spillere. skal evt bruge GUI for det.
    public void amount() {

        Scanner scanner = new Scanner(System.in);

        while (playerList >= 2 && playerList <= 4) {

            System.out.println("Hvor mange spiller i?");

            int players = scanner.nextInt();
            if (players >= 2 && players <= 4) {
                playerList = players;


            } else {
                System.out.println("I skal være 2-4 spillere for at starte spillet");

            }
        }
    }

    public void figures(){

        Account player1 = dogAccount;
        Account player2 = catAccount;
        Account player3 = carAccount;
        Account player4 = shipAccount;

        }
    //kan stå for sig selv
    public void movePlayer(Dice eyes) {
        position = position + geteyes; // parse til int?
        if (position >= 24) {
            position = position - 24;
        }
    }

    /* Eks. Hvis vi har 2 spiller, modulerer vi 2 % 4 = 1. Derefter går den 1 op, fra den spiller der sidst havde tur,
     * i dette tilfælde er det spiller 2, så 2+1 = 3.
     */
    public int playerTurn(){
        int turn = playerTurnCounter % playerList;
        playerTurnCounter++;
        return turn;

        /**
         * Kilde: https://github.com/Niemeijeren/Matador/blob/master/Matador/src/Player.java
         */

    }
}
