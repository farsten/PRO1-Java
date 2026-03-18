package OpgaverL05While;

public class Opgave5DisplayPattern {
    void main() {
        String talPrompt = IO.readln("Giv et tal: ");
        int brugerTal = Integer.parseInt(talPrompt);
        displayPattern(brugerTal);
    }
    public static void displayPattern(int n) {
        int row = 1;
        while (row <= n) {
            int num = 1;
            while (num <= row) {
                IO.print(num + " ");
                num++;
            }
            IO.println("");
            row++;
        }
    }
}
