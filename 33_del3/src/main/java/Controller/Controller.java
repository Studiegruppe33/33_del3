package Controller;

import ent.*;

import java.util.Scanner;
public class Controller {
    Player player = new Player();

    Scanner scanner = new Scanner(System.in);

    public void startGame() {
// bland chancekort metode kaldes først

        player.amount();

        player.startScore();
        while (player.getCarAccount().getScore() != 0 && player.getCatAccount().getScore() != 0 &&
                player.getShipAccount().getScore() != 0 && player.getDogAccount().getScore() != 0) {

            player.playerTurn();
            System.out.println("Kast terningen");
            player.movePlayer();
            scanner.nextLine();
            switch("landon"){
                case emptyfield
                    emptyfield.landOnField
            }



        }
        System.out.println("Du har tabt");
        // metode der afgør hvem der vinder


    }
}

