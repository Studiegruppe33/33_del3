package java.entity;

public abstract class Field {
    private int number;
    private String name;
    private int result;
    private boolean owned = false;


    public Field(int number, String name, int result) {
        this.number = number;
        this.name = name;
        this.result = result;

    }
// denne metode overwrites. hvordan uden fejl?
    public void landOnField(){
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
}
