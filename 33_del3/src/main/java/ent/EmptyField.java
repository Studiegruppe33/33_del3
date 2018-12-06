package ent;

public class EmptyField extends Field {

    public EmptyField(int position, String name, int result)
    {
        super(position, name,result);
    }

    @Override
    public void landOnField() {
        System.out.println(getName());
        // hvilket empty field?
    }
}
