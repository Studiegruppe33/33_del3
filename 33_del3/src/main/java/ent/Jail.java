package ent;

public class Jail extends Field {
    public Jail(int position, String name, int result) {
        super(, name,result);
    }

    Player player;

    @Override
    public void landOnField() {
       player.getxAccount().addToScore(-1);
    }
}


