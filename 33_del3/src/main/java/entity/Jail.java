package java.entity;

public class Jail extends Field {
    public Jail(int number, String name, int result) {
        super(number, name,result);
    }
        // result er 0 nu, fordi kauktionen først betales ved starten af næste tur.
        // hvordan gøres dette?
        // evt if player.isInJail( player.account += -1
    // starter bare med at trække 1 fra når der landes på feltet. det kan evt ændres senere.


    }


