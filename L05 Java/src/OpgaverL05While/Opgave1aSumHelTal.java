package OpgaverL05While;

public class Opgave1aSumHelTal {
    void main() {
        IO.println(sum(100));
    }
    public int sum(int num) {
        int finalResultat = 0;
        int i = 2;
        while (i <= 100) {
            finalResultat = finalResultat + i;
            i += 2;
        }
    return finalResultat;
    }
}
