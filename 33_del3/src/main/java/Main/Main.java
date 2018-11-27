package java.Main;
import java.Controller.Controller;
import java.entity.Chance;
import java.entity.ChanceCard;
import java.entity.Player;

public class Main {

    public static void main(String[] args) {
        new Controller().Begin();
        ChanceCard chanceCard=new ChanceCard();
        chanceCard.deck();
        System.out.println(chanceCard);

        
    }

}
