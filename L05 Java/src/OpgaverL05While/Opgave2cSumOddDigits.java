package OpgaverL05While;

//Lav en klasse med en main() metode.
//Tilføj til klassen en metode sumOddDigits(int number), der returnerer summen af de
//ulige cifre i tallet number. Tallet number skal indlæses.
//Kald metoden i main() metoden.
//        (Resultatet af sumOddDigits(1.234.567) er 16.)
public class Opgave2cSumOddDigits {
    void main() {
        String talPrompt = IO.readln("Angiv et stort tal: ");
        int brugerTal = Integer.parseInt(talPrompt);

        IO.println("Summen af de ulige tal i dit tal er: " + sumOddDigits(brugerTal));
    }

    public int sumOddDigits(int brugerTal) {
        int result = 0;
        int tal;
        while (brugerTal > 0) {
            tal = brugerTal % 10;
            if (tal % 2 != 0)  {
                result += tal;
            }
            brugerTal /= 10;

        }
        return result;
    }
}
