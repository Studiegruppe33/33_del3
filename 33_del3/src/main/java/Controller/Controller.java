package Controller;

import ent.Account;
import ent.Player;
import ent.Dice;
import ent.Field;

public class Controller {

    // Sker det samme for denne account som for den account der kaldes i de andre metode
    // der har en indflydelse på scoren? hvis ikke: hvordan gør vi det til den samme?
    Account account = new Account();
    Player player = new Player();
    Dice dice;
    Field field;



    public void startGame() {
// bland chancekort metode kaldes først
        while (account.getScore() != 0) {
            player.amount();
            player.figures();
            player.movePlayer();
            field.landOnField();


            // hvilket objekt skal metoderne amount, figures etc starte på?

        }
        // metode der afgør hvem der vinder

        System.out.println("Du har tabt");

    }




}
