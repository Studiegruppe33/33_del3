package ent;


public abstract class Field {
    private int position;
    private String name;
    private int result;
    private boolean owned = false;


    public Field(int position, String name, int result) {
        this.position = position;
        this.name = name;
        this.result = result;

    }

    public abstract void  landOnField();


    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
}
