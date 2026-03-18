import java.util.Arrays;
import java.util.Scanner;

public class Opgave6ExtraArray {
    void main() {
//        Exercise 6 – extra
//        Make a class with a main() method and add the following methods to the class (they all take
//        an int array as parameter):
//• A) A method that replaces all even numbers with 0 (zero).
//• B) A method that swaps the first and last element in the array.
//• C) A method that returns true if the elements in the array are sorted ascending.
//• D) A method that shifts all elements in the array to the right (to an index one higher). The
//        element at the last index is shifted to the first index.
//                Example: {1, 4, 9, 16, 25} is changed to {25, 1, 4, 9, 16}
//• E) A method that returns the second-highest element in the array (the array contains at
//                least 2 elements).
//• F) A method that returns true if the array has doublets.
//        Example: true is returned for {2, 5, 8, 5}, false is returned for {2, 5, 8, 6}.
//        Test your methods in main()

        IO.println("Hvor mange tal vil du give? ");
        int capacity = Integer.parseInt(IO.readln());
        Scanner scanner = new Scanner(IO.readln("Angiv de tal du vil give: "));
        int[] t = new int[capacity];
        for (int i = 0; i < t.length; i++) {
            t[i] = scanner.nextInt();

        }
        IO.println("A: " + Arrays.toString(a(Arrays.copyOf(t, t.length)))); // A metode

        IO.println("B: " + Arrays.toString(b(Arrays.copyOf(t, t.length)))); // B metode

        IO.println("C: Ascending? " + c(t)); // C metode

        IO.println("D: " + Arrays.toString(d(Arrays.copyOf(t, t.length)))); // D metode

          if (e(t) == Integer.MIN_VALUE) {
            IO.println("E: Du skal angive mere end ét tal");
        } else {
            IO.println("E: " + e(t) + " er det andet højeste tal");// E metode
        }
        IO.println("C: Doubles? " + f(t)); // f metode
    }

    public int[] a(int[] t) {

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) { // hvis modelus er = 0, så er tallet lige
                t[i] = 0;
            }
        }
        return t;

    }
    public int[] b(int[] t) {

        for (int i = 0; i < t.length; i++) {
            int firstInt = t[0];
            int lastInt = t[t.length - 1];
            t[0] = lastInt;
            t[t.length - 1] = firstInt;


        }
        return t;

    }
    public boolean c(int[] t) {
        boolean isAsc = true;
        int lastNum = Integer.MIN_VALUE;
        for (int i = 0; i < t.length; i++) {
            if (t[i] < lastNum) {
                isAsc = false;
                break;
            }
            lastNum = t[i];
        }
        return isAsc;
    }
    public int[] d(int[] t) {
        int lastInt = t[t.length - 1];
        for (int i = t.length - 1; i > 0; i--) {

            t[i] = t[i - 1];

        }
        t[0] = lastInt;
        return t;
    }
    public int e(int[] t) {

        int largest = Integer.MIN_VALUE;       // smallest possible integer
        int secondLargest = Integer.MIN_VALUE;



            for (int num : t) {

                if (num > largest) {
                    secondLargest = largest;  // old largest becomes second largest
                    largest = num;            // update largest
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;      // update second largest if num is smaller than largest but bigger than secondLargest
                }
            }

            return secondLargest;

    }
    public boolean f(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) { // tjekker alle adnre end det samme tal
                if (t[i] == t[j]) {                  // tjekkrr for double
                    return true;
                }
            }
        }
        return false;
    }
    }













