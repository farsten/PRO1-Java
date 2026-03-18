public class Opgave1aSumHelTalForLoops {
    void main() {
        IO.println(sum(100));
    }
    public int sum(int num) {
        int finalResultat = 0;
        for (int i = 2; i <= num; i += 2) {
            finalResultat += i;
        }
        return finalResultat;
    }
}
