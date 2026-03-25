package Opgave2IntervalSearch;

import java.util.Arrays;

//Write a linear search method that finds the first number belonging to the interval [10;15]. The
//method must return the number found in the interval, and take an array of integer numbers as
//parameter. If a number in the interval is not found, the method must return -1.
//If the array is [7, 56, 34, 3, 7, 14, 13, 4], the method should return 14.
public class Main {
    void main() {

        int[] arr = {7, 56, 34, 3, 7, 14, 13, 4};

        IO.println(Arrays.toString(arr));

        IO.println(interval(arr));

    }

    private int interval(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            if (arr[i] > 10 && arr[i] < 15) {
                found = true;
            } else i++;
        }
        return arr[i];
    }
}
