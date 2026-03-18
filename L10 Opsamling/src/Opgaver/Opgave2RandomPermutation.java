package Opgaver;

import java.util.Arrays;
import java.util.Random;

public class Opgave2RandomPermutation {
    void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = arr.length;
        permutation(arr, number);
    }

    public void permutation(int[] firstArr, int n) {
        Random generator = new Random();
        int[] secondArr = new int[n];
        int size = secondArr.length;
        for (int i = 0; i < n; i++) {

            int count = generator.nextInt(size);
            secondArr[i] = firstArr[count];

            for (int k = count; k < n - 1; k++) {
                firstArr[k] = firstArr[k + 1];
            }
            size--;
        }

        IO.println(Arrays.toString(secondArr));
    }
}

