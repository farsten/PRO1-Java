package OpgaverL04Metoder;

public class Opgave2VoksFaldMetoder {
    void main() {
        String nummerEtPrompt = IO.readln("Skriv et nummer: ");
        int nummerEt = Integer.parseInt(nummerEtPrompt);
        String nummerToPrompt = IO.readln("Skriv et til nummer: ");
        int nummerTo = Integer.parseInt(nummerToPrompt);
        String nummerTrePrompt = IO.readln("Skriv et sidste nummer: ");
        int nummerTre = Integer.parseInt(nummerTrePrompt);

        String orderTal = order(nummerEt, nummerTo, nummerTre);
        IO.println(orderTal);



    }
    public String order(int nummerEt, int nummerTo, int nummerTre) {
        String talRaekke;
        if (nummerEt < nummerTo && nummerTo < nummerTre)
            talRaekke = "Voksende";
        else if (nummerTre < nummerTo && nummerTo < nummerEt)
            talRaekke = "Faldende";
        else
            talRaekke = "Hverken-eller";
return talRaekke;

    }
}
