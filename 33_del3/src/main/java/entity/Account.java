package java.entity;

public class Account {
    private int score;
    private Account account;
    protected int playerAmount;

    // getters for disse

    Account dogAccount;
    Account catAccount;
    Account carAccount;
    Account shipAccount;
    Account xAccount;

    public Account getDogAccount() {
        return dogAccount;
    }

    public Account getCatAccount() {
        return catAccount;
    }

    public Account getCarAccount() {
        return carAccount;
    }

    public Account getShipAccount() {
        return shipAccount;
    }

    public Account getxAccount() {
        return xAccount;
    }

    public void addToScore(int result) {
        if (this.score + result < 0) {

            this.score += result;

        } else {
            this.score = 0;
        }
        }
    public int getScore() {
        return this.score;
    }
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
