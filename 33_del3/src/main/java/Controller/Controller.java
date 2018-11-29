package Controller;

import ent.*;
import java.util.Scanner;
public class Controller {

    // Sker det samme for denne account som for den account der kaldes i de andre metode
    // der har en indflydelse på scoren? hvis ikke: hvordan gør vi det til den samme?
    Account account = new Account();
    Player player = new Player();
    Dice dice = new Dice();
    Field field;





    public void startGame() {
// bland chancekort metode kaldes først
        player.amount();
        player.figures();
        account.startScore();

        while (account.getDogAccount().getScore() != 0 || account.getCarAccount().getScore() != 0 ||
                account.getCatAccount().getScore() != 0 || account.getShipAccount().getScore() != 0) {
            player.playerTurn();
            player.movePlayer();
            field.landOnField();





        }
        // metode der afgør hvem der vinder


        System.out.println("Du har tabt");

    }




}
