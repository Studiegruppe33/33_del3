package ent;



public class Property extends Field {

    private int pair;
    private Account owner = null;

    public Account getOwner() {
        return owner;
    }

    public void setOwner() {
        this.owner = owner;

    }

    public Property(int number, String name, int result, int pair) {
        super(number, name, result);
        this.pair = pair;
        this.owner = owner;
    }


    Player player = new Player();
    Account account = new Account();
    @Override
    public void landOnField() {
// hvis feltet er ledigt kaldes addfield metoden, der tildeler spilleren feltet og fratrækker værdien på kontoen
        if(owner == null) {
            player..addField(this);
            player.getxAccount().addToScore(- getResult());

        } else {
            System.out.println("Ejendommen tilhører" + owner);
            //trækker resultat fra nuværende spillers konto
            account.setScore(account.getScore() - (getResult()));
            // skal lægge resultat til ejers konto.

        }
    }
}

