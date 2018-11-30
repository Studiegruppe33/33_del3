package Stub;

public class StubPlayer {

    public static int stubPlayerTurn() {

        int turn = 3 % 4;

        switch (turn) {
            case 1:
                //carAccount = xAccount;
                System.out.println("Bilens tur");
                break;
            case 2:
                //shipAccount = xAccount;
                System.out.println("Skibets tur");
                break;
            case 3:
                //dogAccount = xAccount;
                System.out.println("Hundens tur");
                break;
            case 4:
                //catAccount = xAccount;
                System.out.println("Kattens tur");
                break;
        }

        return turn;
    }
}
