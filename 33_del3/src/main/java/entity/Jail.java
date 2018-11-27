package java.entity;

public class Jail extends Field {
    public Jail(int number, String name, int result) {
        super(number, name,result);
    }
Account account;
    @Override
    public void landOnField() {
       account.addToScore(-1);
    }
}


