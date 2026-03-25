package Opgave3Adjacent;

public class Main {
    void main() {



        int[] arr1 = {7, 9, 13, 7, 9, 13};
        int[] arr2 = {7, 9, 13, 13, 9, 7};

IO.println(adjacent(arr1));
IO.println(adjacent(arr2));


    }

    private boolean adjacent(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length - 1) {
            if (arr[i + 1] == arr[i]) {
                found = true;
            } else i++;
        }
        return found;
    }


}
