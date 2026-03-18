package Opgaver;

import java.util.Scanner;

public class Opgave3Asterisks {
    void main() {

        IO.println("Hvor mange tal vil du give? ");
        int capacity1 = Integer.parseInt(IO.readln());
        Scanner scanner = new Scanner(IO.readln("Angiv de tal du vil give: "));
        int[] tal1 = new int[capacity1];
        for (int i = 0; i < tal1.length; i++) {
            tal1[i] = scanner.nextInt();
            IO.println(asterisk(tal1));

        }
    }
    public String asterisk(int[] value) {
        int largest = Integer.MIN_VALUE;       // smallest possible integer
        int secondLargest = Integer.MIN_VALUE;



        for (int num : value) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

    }
}
