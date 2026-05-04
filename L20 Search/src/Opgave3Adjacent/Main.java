package Opgave3Adjacent;

public class Main {
    void main() {


        int[] arr1 = {7, 9, 13, 7, 9, 13};
        int[] arr2 = {7, 9, 13, 13, 9, 7};
        int[] arr3 = {1, 1, 1, 2, 2, 2};
        int[] arr4 = {1, 2, 3, 4, 5, 6};

        IO.println(find(arr1, 2)); // false
        IO.println(find(arr2, 2)); // false
        IO.println(find(arr3, 3)); // true
        IO.println(find(arr4, 2)); // false
    }

    private static boolean adjacent(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length - 1) {
            if (arr[i + 1] == arr[i]) {
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    public static boolean find(int[] arr, int n) {
        for (int i = 0; i <= arr.length - n; i++) {
            if (areAllEqual(arr, i, n)) {
                return true;
            }
        }
        return false;
    }

    private static boolean areAllEqual(int[] arr, int start, int n) {
        int first = arr[start];
        for (int i = start + 1; i < start + n; i++) {
            if (arr[i] != first) {
                return false;
            }
        }
        return true;
    }
}
