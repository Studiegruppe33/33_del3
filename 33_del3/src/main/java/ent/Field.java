package ent;


public abstract class Field {

    //States:
    private int position;
    private String name;
    private int result;
    private boolean owned = false;


//Konstruktør
    public Field(int position, String name, int result) {

        //Peger på klassen variabler = states
        this.position = position;
        this.name = name;
        this.result = result;

    }
    //Initialziere player fra player klassen (opretter nyt objekt)
    Player player = new Player();

    //Land on field er tom, derfor virker spillet ikke. Vi overrider denne mange gange, men lige nu er der ikke
    // noget at override.
    public void landOnField(){
        //player.();
    }

//Getters for klassens variabler.
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
