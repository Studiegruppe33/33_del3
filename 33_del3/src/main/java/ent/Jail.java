package ent;

public class Jail extends Field {
    public Jail(int number, String name, int result) {
        super(number, name,result);
    }

    Player player;

    @Override
    public void landOnField() {
       player.getxAccount().addToScore(-1);
    }
}


