package OpgaverL04Metoder;

public class Opgave6StenSaksPapir {
    void main() {
        int botWeapon = (int) (Math.random() * 3);

        String weaponPrompt = IO.readln("Sten saks eller papir (sten er 0, saks er 1 og papir er 2: ");
        int myWeapon = Integer.parseInt(weaponPrompt);

        IO.println(duel(botWeapon, myWeapon) + " vandt!");

    }

    public String duel(int botWeapon, int myWeapon) {
        String duelResult;
        if ((botWeapon == 1 && myWeapon == 2) || (botWeapon == 2 && myWeapon == 0) || (botWeapon == 0 && myWeapon == 1)) {
            duelResult = "Robotten";
        } else if ((botWeapon == 2 && myWeapon == 1) || (botWeapon == 1 && myWeapon == 0) || (botWeapon == 0 && myWeapon == 2) ) {
            duelResult = "Du";
        } else duelResult = "Ingen";
        return duelResult;


    }
}




