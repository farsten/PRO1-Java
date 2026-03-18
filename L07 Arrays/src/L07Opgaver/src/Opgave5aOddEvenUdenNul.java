import java.util.Scanner;

public class Opgave5aOddEvenUdenNul {
    void main() {

        IO.println("Hvor mange tal vil du give (1-10)? ");
        int capacity1 = Integer.parseInt(IO.readln());
        Scanner scanner = new Scanner(IO.readln("Angiv de antal tal: "));
        int[] t = new int[capacity1];
        int i = 0;
        for (i = 0; i < t.length; i++) {
            t[i] = scanner.nextInt();
        }

        evenOdd(t, i);

    }
    public void evenOdd(int[] t, int count) {
        int evenCount = 0;
        int oddCount = 0;

        for (int k = 0; k < count; k++) {
            if ((t[k] % 2 == 0)) {
                evenCount++;
            } else oddCount++;


        }


        IO.println("Lige tal: " + evenCount);
        IO.println("Ulige tal: " + oddCount);
    }


}




