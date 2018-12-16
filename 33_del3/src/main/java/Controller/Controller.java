package Controller;

import ent.*;

import java.util.Scanner;
public class Controller {
    Player player = new Player();

    Scanner scanner = new Scanner(System.in);

    public void startGame() {
// bland chancekort metode kaldes først

        // Antallet af spiller og deres startscore kaldes
        player.amount();
        player.startScore();
        //While loop der bestemmer hvornår spillet kører.
        while (player.getCarAccount().getScore() != 0 && player.getCatAccount().getScore() != 0 &&
                player.getShipAccount().getScore() != 0 && player.getDogAccount().getScore() != 0) {

        // spilleren skifter tur
            player.playerTurn();
            System.out.println("Kast terningen");

            //Herfra virker spillet ikke.
            player.movePlayer(0);
            scanner.nextLine();
            //switch("landon"){
               // case emptyfield
                  //  emptyfield.landOnField
            }



        System.out.println("Du har tabt");
        // metode der afgør hvem der vinder
        }



    }


