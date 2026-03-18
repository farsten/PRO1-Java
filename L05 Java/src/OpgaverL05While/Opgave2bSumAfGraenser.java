package OpgaverL05While;

//Lav en klasse med en main() metode.
//Tilføj til klassen en metode sumEvenInts(int lower, int upper), der returnerer summen
//af alle lige tal mellem lower og upper (inklusive). Grænserne lower og upper skal
//indlæses.
//Kald metoden i main() metoden.
//        (Resultatet af sumEvenInts(7, 25) er 144.)
public class Opgave2bSumAfGraenser {
    void main() {
        String lowerPrompt = IO.readln("Det nedre interval: ");
        int lower = Integer.parseInt(lowerPrompt);

        String upperPrompt = IO.readln("Det øvre interval: ");
        int upper = Integer.parseInt(upperPrompt);

        IO.println("Summen af de lige tal i intervallet er: " + sumEvenInts(lower, upper));
    }

    public int sumEvenInts(int lower, int upper) {

        if (lower % 2 != 0) {    //Hvis at lower ikke er et lige tal
            lower++;
        }
        int sum = 0;
        while (lower <= upper) {
            sum = sum + lower;
            lower += 2;
        }
        return sum;
    }
}