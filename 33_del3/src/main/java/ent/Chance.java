package ent;

//Nedarver fra field
public class Chance extends Field{
    public Chance(int position, String name, int result) {
        super(position, name, result);
    }

    //Skal have en seperat metode, da der sker noget andet en normalt, når man lander på dette felt
    @Override
    public void landOnField() {

    }
}
