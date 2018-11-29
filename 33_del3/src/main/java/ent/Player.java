package ent;
import java.util.Scanner;
public class Player {
    private String name;
    private Account account;
    private int playerAmount;
    private Player players;
    private int position;
    private int playerList;



    Account dogAccount = new Account();
    Account catAccount = new Account();
    Account carAccount = new Account();
    Account shipAccount = new Account();
    Account xAccount = new Account();





    // metode der vælger 2-4 spillere. skal evt bruge GUI for det.
    public void amount() {
        System.out.println("Hvor mange spiller i?");

        Scanner scanner = new Scanner(System.in);

        while (true) {
        int players = scanner.nextInt();
        if (players >= 2 && players <= 4) {
            playerList = players;
            System.out.println(" I er " + playerList + " spillere.");
            break;


        } else {
            System.out.println("I skal være 2-4 spillere for at starte spillet");

        }
    }

}

        Dice dice;

    public void movePlayer() {
        if (position > 23) {
            position = position - 23;
        }else {
            position = position + dice.getEyes();

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
    public void playerTurn(){
        int playerTurnCounter = 0;
        int turn = playerTurnCounter % playerList;
        playerTurnCounter++;
        switch (turn){
            case 1:
                carAccount = xAccount;
            case 2:
                shipAccount = xAccount;
            case 3:
                dogAccount = xAccount;
            case 4:
                catAccount = xAccount;
        }


        }
    public void startScore() {
        if (playerList == 2) {
            carAccount.addToScore(20); catAccount.addToScore(20);
            dogAccount.addToScore(20); shipAccount.addToScore(20);
        } else if (playerList == 3) {
            carAccount.addToScore(18); catAccount.addToScore(18);
            dogAccount.addToScore(18); shipAccount.addToScore(18);
        } else if (playerList == 4) {
            carAccount.setScore(16); catAccount.setScore(16);
            dogAccount.setScore(16); shipAccount.setScore(16);
        }
        System.out.println("Bil saldo: " + carAccount.getScore() + ", Kat saldo: " + catAccount.getScore()
                + ", Hund saldo: " + dogAccount.getScore() + ", Skib saldo: " + shipAccount.getScore());
    }

    public Account getDogAccount() {
        return dogAccount;
    }

    public Account getCatAccount() {
        return catAccount;
    }

    public Account getCarAccount() {
        return carAccount;
    }

    public Account getShipAccount() {
        return shipAccount;
    }

    public Account getxAccount() {
        return xAccount;
    }

    /**
         * Kilde: https://github.com/Niemeijeren/Matador/blob/master/Matador/src/Player.java
         */


}
