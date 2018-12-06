package Controller;

import ent.*;

import java.util.Scanner;
public class Controller {
    Account account = new Account();
    Player player = new Player();
    // håber ikke parametre har indflydelse?
    Field field = new Field(1,"none",0);
    Player dog = new Player();
    Player cat = new Player();
    Player car = new Player();
    Player ship = new Player();

    private int playerTurnCounter;


    Scanner scanner = new Scanner(System.in);

    public void startGame() {
// bland chancekort metode kaldes først


        player.amount();

        // startScore metode
        if (player.amount() == 2) {
            car.getCarAccount().setScore(20); cat.getCatAcoount().setScore(20);
            dog.getDogAccount().setScore(20); ship.getShipAccount().setScore(20);
        } else if (player.amount() == 3) {
            car.getCarAccount().setScore(18); cat.getCatAcoount().setScore(18);
            dog.getDogAccount().setScore(18); ship.getShipAccount().setScore(18);
        } else if (player.amount() == 4) {
            car.getCarAccount().setScore(16); cat.getCatAcoount().setScore(16);
            dog.getDogAccount().setScore(16); ship.getShipAccount().setScore(16);
        }

        while (player.getCarAccount().getScore() != 0 && player.getCatAcoount().getScore() != 0 &&
                player.getShipAccount().getScore() != 0 && player.getDogAccount().getScore() != 0) {





            int turn = playerTurnCounter % player.amount();
            switch (turn) {
                case 0:
                    car = player;
                    car.getCurrentAccount() = car.getCarAccount();
                    System.out.println("Bilens tur");
                    playerTurnCounter++;
                    break;
                case 1:
                    cat = player;
                    System.out.println("Kattens tur");
                    playerTurnCounter++;
                    break;
                case 2:
                    dog = player;
                    System.out.println("Hundens tur");
                    playerTurnCounter++;
                    break;
                case 3:
                    ship = player;
                    System.out.println("Skibets tur");
                    playerTurnCounter=0;




        }
            System.out.println("Kast terningen");
            player.movePlayer();
            scanner.nextLine();
            field.landOnField();



        }
        System.out.println("Du har tabt");
        // metode der afgør hvem der vinder


    }
}

