package Opgaver;

import java.util.Scanner;

public class Opgave5Arrays {
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
        if (equal(tal1, tal2)) {
            IO.println("Nice! Dine tal er helt identiske!");
        } else if (sameValues(tal1, tal2)) {
            IO.println("Dine tal er ikke helt identiske, de er bare i forkert rækkefølge!");
        } else IO.println("Dine tal er slet ikke tæt på hinanden :(");


    }

    public boolean equal(int[] arr1, int[] arr2) {
        int[] maxArray = new int[Math.max(arr1.length, arr2.length)];
        boolean isFullEqual = false;
        for (int i = 0; i < maxArray.length; i++) {

            if (arr1.length == arr2.length) {
                isFullEqual = arr1[i] == arr2[i];
            }


        }
        return isFullEqual;

    }

    private static boolean elementInArray(int[] array, int element) {

        for (int j : array) {
            if (j == element) {
                return true;
            }
        }

        return false;
    }

    public boolean sameValues(int[] arr1, int[] arr2) {
        for (int k : arr1) {
            if (!elementInArray(arr2, k)) {
                return false;
            }
        }

        for (int j : arr2) {
            if (!elementInArray(arr1, j)) {
                return false;
            }
        }
        return true;
    }

}
