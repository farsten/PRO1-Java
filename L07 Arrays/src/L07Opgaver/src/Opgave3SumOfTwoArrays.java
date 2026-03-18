import java.util.Arrays;
import java.util.Scanner;

public class Opgave3SumOfTwoArrays {
    //    Exercise 3
//    To the ArrayTest class, add a method
//    public int[] sumArrays(int[] a, int[] b)
//    that takes two arrays of the same length as parameters, and returns a new array with the same
//    length as a and b. The returned array must contain the sum of the values in a and b.
//    If a = {4,6,7,2,3} and b = {4,6,8,2,6}, the method should return {8,12,15,4,9}.
//    Make another method that works for arrays of unequal lengths (the result array must have the
//            length of the longest array).
//    Test your methods in main()
    void main() {

        IO.println("Hvor mange tal vil du give? ");
        int capacity1 = Integer.parseInt(IO.readln());
        Scanner scanner = new Scanner(IO.readln("Angiv de tal du vil give: "));
        int[] tal1 = new int[capacity1];
        for (int i = 0; i < tal1.length; i++) {
            tal1[i] = scanner.nextInt();
        }

        IO.println("Hvor mange tal vil du give igen?:");
        int capacity2 = Integer.parseInt(IO.readln());
        Scanner scanner2 = new Scanner(IO.readln("Angiv de tal du vil give igen: "));
        int[] tal2 = new int[capacity2];
        for (int k = 0; k < tal2.length; k++) {
            tal2[k] = scanner2.nextInt();

        }
        if (tal1.length > tal2.length || tal1.length < tal2.length) {
            IO.println("Summen af de ulige antal tal du gav er: " + Arrays.toString(sumUnevenArrays(tal1, tal2)));
        } else {
            IO.println("Summen af de lige antal tal du gav er: " + Arrays.toString(sumArrays(tal1, tal2)));
        }


    }

    public int[] sumArrays(int[] a, int[] b) {
        int[] c = new int[100];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];

        }

        return c;
    }


    public int[] sumUnevenArrays(int[] a, int[] b) {
        int[] sumArray = new int[Math.max(a.length, b.length)]; //finder den med størst længde
        int[] minimumLength = new int[Math.min(a.length, b.length)]; // finder mindste længde

        for (int i = 0; i < minimumLength.length; i++) {
            sumArray[i] = a[i] + b[i];
        }
        if (a.length > b.length) {
            for (int i = minimumLength.length; i < a.length; i++) {
                sumArray[i] = a[i];
            }

        } else for (int i = minimumLength.length; i < b.length; i++) {
            sumArray[i] = b[i];
        }
        return sumArray;


    }
}






