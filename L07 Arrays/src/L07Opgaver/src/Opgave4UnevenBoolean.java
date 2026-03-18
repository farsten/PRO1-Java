import java.util.Arrays;
import java.util.Scanner;

public class Opgave4UnevenBoolean {
    void main() {
//        To the ArrayTest class, add a method
//        public boolean hasUneven(int[] t)
//        that returns true, if t includes at least one uneven number.
//                If t = {4,6,7,2,3}, true must be returned; if t = {4,6,8,2,6}, false must be returned.
//                Test your method in main().
        IO.println("Hvor mange tal vil du give? ");
        int capacity1 = Integer.parseInt(IO.readln());
        Scanner scanner = new Scanner(IO.readln("Angiv de tal du vil give og se om nogle af dem er ulige: "));
        int[] t = new int[capacity1];
        for (int i = 0; i < t.length; i++) {
            t[i] = scanner.nextInt();
        }
        IO.println(hasUneven(t));
    }
        public boolean hasUneven(int[] t) {
            boolean ulige = false;
            for (int i = 0; i < t.length; i++) {
                if (t[i] % 2 != 0) {
                    ulige = true;
                }
            }
            return ulige;
        }
}
