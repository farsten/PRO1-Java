package OpgaverL14.ex4;

import java.util.ArrayList;
import java.util.List;

public class ExTest {
    void main() {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 25, 33, 32, 3));

//        IO.println(firstLastSwitch(list));
//        IO.println(evenToZero(list));
//        IO.println(secondHighestNumber(list));
//        IO.println(isAsc(list));
//        IO.println(plusIndex(list));
        IO.println(hasDoubles(list));
    }

    public ArrayList<Integer> firstLastSwitch(ArrayList<Integer> list) {
        int first = list.getFirst();
        int last = list.getLast();
        list.set(0, last);
        list.set(list.size() - 1, first);
        return list;

    }

    public ArrayList<Integer> evenToZero(ArrayList<Integer> list) {
        int i = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                list.set(i, 0);
            }
            i++;
        }
        return list;
    }

    public double secondHighestNumber(ArrayList<Integer> list) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > largest) {
                secondLargest = largest;
                largest = list.get(i);
            } else if (list.get(i) > secondLargest && list.get(i) != largest) {
                secondLargest = list.get(i);
            }
        }
        return secondLargest;
    }

    public boolean isAsc(ArrayList<Integer> list) {
        boolean isAsc = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isAsc = false;
                break;
            }
        }
        return isAsc;
    }

    public ArrayList<Integer> plusIndex(ArrayList<Integer> list) {
//        int lastInt = list.get(list.size() - 1);
//        for (int i = list.size() - 1; i > 0; i--) {
//            list.set(i, list.get(i - 1));
//
//        }
//        list.set(0, lastInt);
//        return list;

        // ALTERNATIV METODE//
        list.addFirst(list.removeLast());
       return list;
    }

    public boolean hasDoubles(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) { // tjekker alle adnre end det samme tal
                if (list.get(i).equals(list.get(j))) { // tjekker for double
                    return true;
                }
            }
        }
        return false;
    }
}