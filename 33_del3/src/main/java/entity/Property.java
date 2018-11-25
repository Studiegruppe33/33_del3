package java.entity;



public class Property extends Field {

    private int par;

    public Property(int number, String name, int result, int par) {
        super(number, name, result);
        this.par = par;
    }

    @Override
    public void landOnField(Player player) {
        public boolean buyField(){

        }



// Xplayer owns now

        // hvordan afgøres hvem der ejer hvad?
        // metode der gør noget for denne field. for disse skal man enten købe grund eller betale leje.
        //if optaget: betal modspiller. kald metoden addToScore for begge spillere.
        // else: kald metoden addToScore kun for spilleren. Han skal nu eje grunden.
    }
}
