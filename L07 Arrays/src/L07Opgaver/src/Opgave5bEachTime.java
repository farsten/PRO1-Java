import java.util.Scanner;

public class Opgave5bEachTime {
    //    (Count occurrence of numbers) Write a program that reads the integers between 1
//    and 50 and counts the occurrences of each. Assume the input ends with 0. Here is
//    a sample run of the program.
    void main() {
        int[] count = new int[51];
        Scanner scanner = new Scanner(IO.readln("Angiv tal 1..50 og slut med 0: "));
        int tal = scanner.nextInt();


        while (tal != 0) {
            if (tal >= 1 && tal <= 50) {
                count[tal] = count[tal] + 1;
            } else {
                IO.println("Du har givet et tal udenfor intervallet.");
                break;
            }
            tal = scanner.nextInt();
        }
        for (int i = 0; i < 50; i++) {
            if (count[i] > 0) {
                if (count[i] > 1) {
                    IO.println(i + " occurs " + count[i] + " times!");
                } else {
                    IO.println(i + " occurs " + count[i] + " time!");
                }
            }
        }
    }
}


