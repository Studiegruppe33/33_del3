package ent;

import java.util.ArrayList;

public class Account {
    // States:
    private int score;
    private Account account;
    protected int playerAmount;
    // liste over spillerens ejede properties
    private ArrayList<Property> ownedFields = new ArrayList<>();




    //addToScore metode
    public void addToScore(int result) {
        //this.score refere til vores score i states.
        if (this.score + result < 0) {

            this.score += result;

        } else {
            this.score = 0;
        }
    }


    //Setter scoren
    public void setScore(int score) {
        this.score = score;
    }

    //Getter gør det muligt at udskrive værdien
    public int getScore() {
        return score;
    }

    // addField kaldes når feltet er tomt. adder feltet til spillerens feltarray og trækker pengene fra hans beholdning
    // owner er nu ikke længere null, så det fremgår at feltet er optaget.
    public void addField(Property xProperty) {
        ownedFields.add(xProperty);
        xProperty.setOwner();
    }

}
