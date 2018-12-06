package ent;
import java.util.Scanner;
public class Player {
    private String name;
    private Account account;
    private int playerAmount;
    private Player players;
    private int position;
    private int playerList;
    private int playerTurnCounter = 0;

    Account dogAccount = new Account();
    Account catAcoount = new Account();
    Account shipAccount = new Account();
    Account carAccount = new Account();
    Account currentAccount = new Account();


    // metode der vælger 2-4 spillere
    public int amount() {
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
        return playerList;
    }

    Dice dice = new Dice();
    GameBoard gameBoard = new GameBoard();

    public void movePlayer() {
        dice.ThrowDice();
        System.out.println("Du slog " + dice.getEyes());
        if (position + dice.getEyes() > 23) {
            position += dice.getEyes() - 23;
        } else {
            position = position + dice.getEyes();
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int boardNumber) {
        position = boardNumber;
    }

    /* Eks. Hvis vi har 2 spiller, modulerer vi 2 % 4 = 1. Derefter går den 1 op, fra den spiller der sidst havde tur,
     * i dette tilfælde er det spiller 2, så 2+1 = 3.
     */


    public Account getDogAccount() {
        return dogAccount;
    }

    public Account getCatAcoount() {
        return catAcoount;
    }

    public Account getShipAccount() {
        return shipAccount;
    }

    public Account getCarAccount() {
        return carAccount;
    }
    public Account getCurrentAccount(){
        return currentAccount;
    }
}
