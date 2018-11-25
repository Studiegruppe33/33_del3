package java.entity;

public class Chance extends Field {
    public Chance(int number, String name, int result) {
        super(number, name, result);
    }
    // dan objekter af hver chanceklasse og inddel dem i et array, som starter tilfældigt
    // herfra lægges øverste kort nederst i arrayet, så alle rykker en gang ned.

    Account currentAccount;



    public void chancecard1(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(2);
    }
}


// dan objekter fra Chance-klassen og kald de enkelte metoder for hvert kort.