package ent;

public class Jail extends Field {
    public Jail(int number, String name, int result) {
        super(number, name,result);
    }

    Account account;

    @Override
    public void landOnField() {
       account.getxAccount().addToScore(-1);
    }
}


