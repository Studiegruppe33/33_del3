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

    public Property(int position, String name, int result, int pair) {
        super(position, name, result);
        this.pair = pair;
        this.owner = owner;
    }


    Player player = new Player();

    @Override
    public void landOnField() {
// hvis feltet er ledigt kaldes addfield metoden, der tildeler spilleren feltet og fratrækker værdien på kontoen
        if(owner == null) {
            player.currentAccount.addField(this);
            player.currentAccount.addToScore(- getResult());

        } else {
            System.out.println("Ejendommen tilhører" + owner);
            //trækker resultat fra nuværende spillers konto
            player.currentAccount.setScore(player.currentAccount.getScore() - (getResult()));
            // skal lægge resultat til ejers konto.

        }
    }
}

