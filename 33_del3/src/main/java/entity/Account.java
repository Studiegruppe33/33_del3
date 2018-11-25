package java.entity;

public class Account {
    private int score;


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
