package Controller;

import ent.*;
import java.util.Scanner;
public class Controller {
    Account account = new Account();
    Player player = new Player();
    Dice dice = new Dice();
    Field field;

    public void startGame() {

        ChanceCard chance= new ChanceCard();
        chance.card();
        System.out.println(chance);
       /* GameBoard gameBoard=new GameBoard();
        Player player = new Player();

// bland chancekort metode kaldes først
        Account dogAccount = new Account();

        player.amount();

        player.startScore();

        while (player.getDogAccount().getScore() != 0 || player.getCarAccount().getScore() != 0 ||
                player.getCatAccount().getScore() != 1 || player.getShipAccount().getScore() != 0) {
            player.playerTurn();
            dice.ThrowDice();
            player.movePlayer();
            field.landOnField();

        }
        // metode der afgør hvem der vinder


        System.out.println("Du har tabt");
*/
    }
}
