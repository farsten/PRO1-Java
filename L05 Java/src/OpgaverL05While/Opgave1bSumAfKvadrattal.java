package OpgaverL05While;

public class Opgave1bSumAfKvadrattal {
    void main() {
        IO.println("Summen af alle kvadrat tal mellem 1-100 er: " + sum(100));
    }
    public int sum(int limit) {
        int finalResultat = 0;
        int i = 1;

        while (i * i <= limit) {
            finalResultat = finalResultat + (i * i);
            i++;
        }

        return finalResultat;
    }
}
