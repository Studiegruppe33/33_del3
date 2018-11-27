package java.Controller;

import java.entity.Account;
import java.entity.Player;

public class Controller {

    // Sker det samme for denne account som for den account der kaldes i de andre metode
    // der har en indflydelse på scoren? hvis ikke: hvordan gør vi det til den samme?
    Account account = new Account();
    Player player = new Player();
    public void startGame(){
// bland chancekort metode kaldes først
        while(account.getScore() != 0){
            player.amount();
            player.figures();
            player.movePlayer();


            // hvilket objekt skal metoderne amount, figures etc starte på?

        }





    }
}
