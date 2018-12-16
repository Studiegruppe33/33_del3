package ent;
import java.util.Scanner;
public class Player {
    //States:
    private String name;
    private Account account;
    private int playerAmount;
    private Player players;
    private int position;
    private int playerList;
    private int playerTurnCounter = 0;

    //Objekter
    Account dogAccount = new Account();
    Account catAccount = new Account();
    Account carAccount = new Account();
    Account shipAccount = new Account();
    Account currentAccount = new Account();





    // metode der vælger 2-4 spillere
    public int amount() {
        System.out.println("Hvor mange spiller i?");

        Scanner scanner = new Scanner(System.in);

//Man indtaster hvor mange spiller man er
        int players = scanner.nextInt();

        //While true sørger for at spiller bliver ved med at kører efter man har valgt antal spiller.
        while(true) {

        if (players >= 2 && players <= 4) {
            playerList = players;
            System.out.println("I er " + playerList + " spillere.");
            break;


        } else {
            System.out.println("I skal være 2-4 spillere for at starte spillet");
            break;

        }

    }
return playerList;
}
//Intialisere nye objektet fra andre klasser
    Dice dice = new Dice();
    GameBoard gameBoard = new GameBoard();

    // movePLayer har parameteren position
    public int movePlayer(int position) {
        //Spilleren kaster terningen
        dice.ThrowDice();
        System.out.println("Du slog " + dice.getEyes());
        //Spillerens position ændres med det terningen har slået, så han rykker det antal felter frem.
        // hvis spilleren er nået til det sidste felt, rykker han fra felt 0 istedet.
        if (position + dice.getEyes() > 23) {
            position += dice.getEyes() - 23;
        }else {
            position = position + dice.getEyes();
        }  return position;
    }


//Setter og getter
    public void setPosition (int boardNumber){
        position = boardNumber;
    }
    public int getPosition (){
        return position;
    }

    /* Eks. Hvis vi har 2 spiller, modulerer vi 2 % 4 = 1. Derefter går den 1 op, fra den spiller der sidst havde tur,
     * i dette tilfælde er det spiller 2, så 2+1 = 3.
     */

    public int playerTurn() {

        int turn = playerTurnCounter % playerList;


            switch (turn) {
                case 0:
                    currentAccount = carAccount;
                    System.out.println("\nBilens tur");
                    playerTurnCounter++;
                    break;
                case 1:
                    currentAccount = shipAccount;
                    System.out.println("Kattens tur");
                    playerTurnCounter++;
                    break;
                case 2:
                    currentAccount = dogAccount;
                    System.out.println("Hundens tur");
                    playerTurnCounter++;
                    break;
                case 3:
                    currentAccount = carAccount;
                    System.out.println("Skibets tur");
                playerTurnCounter=0;



            }

            return turn;
        }
//Sætter spillerens startscore. I vores metode, kan man se alle 4 mulige player score, selvom man kun er 2 personer
    public void startScore() {
        if (playerList == 2) {
            carAccount.setScore(20); catAccount.setScore(20);
            dogAccount.setScore(20); shipAccount.setScore(20);
        } else if (playerList == 3) {
            carAccount.setScore(18); catAccount.setScore(18);
            dogAccount.setScore(18); shipAccount.setScore(18);
        } else if (playerList == 4) {
            carAccount.setScore(16); catAccount.setScore(16);
            dogAccount.setScore(16); shipAccount.setScore(16);
        }
        System.out.println("\nBil saldo: " + carAccount.getScore() + "\nKat saldo: " + catAccount.getScore()
                + "\nHund saldo: " + dogAccount.getScore() + "\nSkib saldo: " + shipAccount.getScore());
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
        return currentAccount;
    }




}

