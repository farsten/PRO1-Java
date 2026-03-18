public class Opgave1bPotenserAfToForLoops {
    void main() {
        printPowersOfTwo();
    }

    public void printPowersOfTwo() {

        int potens = 1;
        for (int i = 0; i <= 20; i++) {
            IO.println("2" + "^" + i + " = " + potens);
            potens *= 2;
        }
        potens -= 1;
    }
}

