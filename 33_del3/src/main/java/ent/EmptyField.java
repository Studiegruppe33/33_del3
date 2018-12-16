package ent;

//Nedarver fra klassen field

public class EmptyField extends Field {

    public EmptyField(int position, String name, int result)
    {
        super(position, name,result);
    }

    //Skal have dens egen landOnField metode
    @Override
    public void landOnField() {
        System.out.println(getName());
        // hvilket empty field?
    }
}
