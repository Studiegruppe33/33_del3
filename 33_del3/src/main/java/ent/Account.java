package ent;

import java.util.ArrayList;

public class Account {
    private int score;
    private Account account;
    protected int playerAmount;
    private ArrayList<Property> ownedFields = new ArrayList<>();
    // liste over spillerens ejede properties




    public void addToScore(int result) {
        if (this.score + result < 0) {

            this.score += result;

        } else {
            this.score = 0;
        }
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // kaldes når feltet er tomt. adder feltet til spillerens feltarray og trækker pengene fra hans beholdning
    // owner er nu ikke længere null, så det fremgår at feltet er optaget.
    public void addField(Property xProperty) {
        ownedFields.add(xProperty);
        xProperty.setOwner();
    }

}
