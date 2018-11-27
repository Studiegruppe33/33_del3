package ent;



public class Property extends Field {

    private int par;
    private Player owner = null;

    public Player getOwner() {
        return owner;
    }

    public void setOwner() {
        this.owner = owner;

    }

    public Property(int number, String name, int result, int par) {
        super(number, name, result);
        this.par = par;
        this.owner = owner;
    }


    Account account; // vi har bare initialiseret et tilfældigt objekt her.
    @Override
    public void landOnField() {
// hvis feltet er ledigt kaldes addfield metoden, der tildeler spilleren feltet og fratrækker værdien på kontoen
        if(owner == null) {
            account.addField(this);

        } else {
            System.out.println("Ejendommen tilhører" + owner.xAccount);
            //trækker resultat fra nuværende spillers konto
            account.setScore(account.getScore()-(getResult()));
            // lægger resultat til ejers konto.
            owner.xAccount.setScore(account.getScore()+(getResult()));
        }
// er ikke sikker på om scoren lægges til rigtige owner så test dette.

    }
}

