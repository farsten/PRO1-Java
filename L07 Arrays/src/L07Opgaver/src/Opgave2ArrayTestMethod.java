import java.util.Arrays;
import java.util.Scanner;

public class Opgave2ArrayTestMethod {
    void main() {
//        Exercise 2
//        Create a class named ArrayTest with a main() method.
//                To the ArrayTest class, add a method
//        public int sum(int[] t)
//        that returns the sum of the numbers in the array.
//        If t = {4,6,7,2,3}, the method should return 22.
//        Test your method in main().
        IO.println("Skriv 10 heltal på én linje:");
        Scanner scanner = new Scanner(IO.readln());
        int[] ex1 = new int[10];
        for (int i = 0; i < ex1.length; i++) {
            ex1[i] = scanner.nextInt();
        }
        IO.println("Ved hjælp af arrays, er summen af dine tal: " + sum(ex1));


    }

    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;

        }
        return sum;
    }
}
