package OpgaverL05While;

//Lav en klasse med en main() metode.
//Tilføj til klassen en metode printPowersOfTwo(), der udskriver alle potenser af 2 fra 20
//til 2'20.
//        (Bemærk, at metodens returtype er void, de den ikke returnerer noget.)
//Kald metoden i main() metoden.
//OBS: Metoden må ikke bruge Math.pow(a,b). Metoden skal bruge en while sætning.
public class Opgave2aPotenserAfTo {
    void main() {
printPowersOfTwo();
    }

    public void printPowersOfTwo() {
        int i = 0;
        int potens = 1;
        while (i <= 20) {
            IO.println("2" + "^" + i + " = " + potens);
            potens *= 2;
            i++;
        }
    }
}
