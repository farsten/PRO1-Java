package Opgaver;
import java.util.Random;
//inRun = false
//For each index i in the array
//If inRun
//If values[i] is different from the preceding value
//Print )
//inRun = false
//If not inRun
//If i is not the last index and
//values[i] is the same as the following value
//Print (
//                inRun = true
//                        Print values[i]
//                        If inRun, print )
public class Opgave1TyveTerningeKast {
    void main() {
        boolean inRun = false;
        Random generator = new Random();
        IO.println("From the random number generator: ");
        int[] dice = new int[20];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = generator.nextInt(6) + 1;
        }
        for (int i = 0; i < dice.length; i++) {

            if (inRun) {
                if (dice[i] != dice[i - 1]) {
                    IO.print(")" + " ");
                    inRun = false;
                }
            }
            if (!inRun) {
                if (i < dice.length - 1 && dice[i] == dice[i + 1]) {
                    IO.print("(");
                    inRun = true;
                }
            }
            IO.print(dice[i] + " ");
        }
        if (inRun) {
            IO.print(")");
        }
    }
}