package java.entity;
public class GameBoard {
private Field[] fields;

    public void gameBoard() {
        Field[] fields = new Field[24];
        fields[0] = new Start;  //Startknap objekt dannes her udfra dennes klasse. kald dennes metode i samme indeks.
        fields[1] = new Property(2,"Burgerbaren",1,1);// af den rigtige art. her udfyldes parametrene så metoden passer.
        fields[2] = new Property(3,"Pizzariaet",1,1);
        fields[3] = new Chance;// kald chancekortene her
        fields[4] = new Property(5,"Slikbutikken",1,2);
        fields[5] = new Property(6,"Iskiosken",1,2);
        fields[6] = new EmptyField(7, "På besøg", 0);
        fields[7] = new Property(8,"Museet",2,3);
        fields[8] = new Property(9,"Biblioteket",2,3);
        fields[9] = new Chance;
        fields[10] = new Property(11,"SkaterParken",2,4);
        fields[11] = new Property(12,"Swimmingpoolen",2,4);
        fields[12] = new EmptyField(13,"Gratis parkering", 0)
        fields[13] = new Property(14,"Spillehallen",3,5);
        fields[14] = new Property(15,"Biografen",3,5);
        fields[15] = new Chance;
        fields[16] = new Property(17,"Legetøjsbutikken",3,6);
        fields[17] = new Property(18,"Dyrehandlen",3,6);
        fields[18] = new Jail(19,"Gå direkte i fængsel",-1):
        fields[19] = new Property(20,"Bowlinghallen",4,7);
        fields[20] = new Property(21,"Zoo",4,7);
        fields[21] = new Chance;
        fields[22] = new Property(23,"Vandlandet",5,8);
        fields[23] = new Property(24,"Strandpromenaden",5,8);


    }
}
