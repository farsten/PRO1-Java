package Opgave8Swap;

import Opgave4Player.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Main {
    void main() {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 8, 13, 7));
        int target = 13;

        IO.println("Before searching for " + target + ": " + Arrays.toString(numbers.toArray()));


        IO.println(findNumberIndex(numbers, target));

    }

    public int findNumberIndex(ArrayList<Integer> numbers, int target) {

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(target)) {
                if (numbers.get(i).equals(numbers.getFirst())) {
                    return i;
                }
                int previousNumber = numbers.get(i - 1);
                numbers.set(i - 1, numbers.get(i));
                numbers.set(i, previousNumber);
                return i - 1;
            }
        }
        return 0;
    }
}


