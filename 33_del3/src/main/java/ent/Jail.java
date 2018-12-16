package ent;

//Nedarver fra klassen field
public class Jail extends Field {
    public Jail(int position, String name, int result) {
        super(position, name, result);
    }

    Player player;

    //Har den egen metode for landOnField, hvor man trækker -1 fra spillerens point, når han lander på dette dette felt.
    @Override
    public void landOnField() {
       player.getxAccount().addToScore(-1);
    }
}


