package ent;


public class Field {
    private int position = 0;
    private String name;
    private int result;
    private boolean owned = false;


    public Field(int position, String name, int result) {
        this.position = position;
        this.name = name;
        this.result = result;

    }

    public void  landOnField(){
    }


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
