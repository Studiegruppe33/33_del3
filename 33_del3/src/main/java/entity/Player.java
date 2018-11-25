package java.entity;
import java.util.Scanner;
public class Player {
    private String name;
    private Account account;
    private int playerAmount;
    private int position;


    // getters for disse

    Account dogAccount;
    Account catAccount;
    Account carAccount;
    Account shipAccount;
    Account xAccount;

    Scanner scanner = new Scanner(System.in);
    // metode der vælger 2-4 spillere. skal evt bruge GUI for det.
    public void amount(){

    }


    // denne metode kaldes inden spillet starter. Afgør antal spillere og tildeler penge ud fra antal.
    public void startScore(){
        xAccount = shipAccount;
        xAccount = carAccount;
        xAccount = catAccount;
        xAccount = dogAccount;

        if (playerAmount == 2){
           xAccount.addToScore(20);
        }
        else if(playerAmount == 3){
            xAccount.addToScore(18);
        }
        else if (playerAmount == 4){
           xAccount.addToScore(16);
        }
    }

    public void movePlayer(int dice) {
        position = position + dice;
        if (position >= 21) {
            position = position - 21;
        }
    }
}
