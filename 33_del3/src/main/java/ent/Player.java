package ent;
import java.util.Scanner;
public class Player {
    private String name;
    private Account account;
    private int playerAmount;
    private Player players;
    private int position;
    private int playerList;


    int playerTurnCounter = 0;


    Account dogAccount = new Account();
    Account catAccount = new Account();
    Account carAccount = new Account();
    Account shipAccount = new Account();
    Account xAccount = new Account();


    // metode der vælger 2-4 spillere. skal evt bruge GUI for det.
    public void amount() {
        System.out.println("Hvor mange spiller i?");

        Scanner scanner = new Scanner(System.in);

        while (playerList >= 2 && playerList <= 4) {

        int players = scanner.nextInt();
        if (players >= 2 && players <= 4) {
            playerList = players;
            System.out.println(" I er " + playerList);


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
        Dice dice;

    public void movePlayer() {
        position = position + dice.getEyes(); // parse til int?
        if (position > 23) {
            position = position - 23;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition (int boardNumber){
        position = boardNumber;
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

    public Account getxAccount() {
        return xAccount;
    }
}
