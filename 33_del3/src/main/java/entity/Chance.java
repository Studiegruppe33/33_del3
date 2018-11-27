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


    public void chancecard2(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(3);
    }
    public void chancecard3(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(4);
    }

    public void chancecard4(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(5);
    }

public void chancecard5(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(6);
        }
    public void chancecard6(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(7);
    }
    public void chancecard7(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(8);
    }
    public void chancecard8(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(9);
    }
    public void chancecard9(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(10);
    }
    public void chancecard10(){
        System.out.println("Du har lavet alle dine lektier. Modtag 2 af banken");
        currentAccount.addToScore(11);
    }
        }

// dan objekter fra Chance-klassen og kald de enkelte metoder for hvert kort.