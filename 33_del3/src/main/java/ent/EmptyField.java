package ent;

public class EmptyField extends Field {



    public EmptyField(int number, String name, int result) {
        super(number, name,result);
    }
    @Override
    public void landOnField() {
        System.out.println(getName());
    }

}
