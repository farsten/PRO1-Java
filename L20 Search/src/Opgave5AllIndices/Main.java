package Opgave5AllIndices;

import java.util.ArrayList;

public class Main {
    void main() {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Abe");
        arr.add("Bob");
        arr.add("Carl");
        arr.add("Tony");
        arr.add("John");
        arr.add("Julie");
        arr.add("Karl");
        arr.add("Larry");
        arr.add("Michael");
        arr.add("Robin");
        arr.add("Sam");
        arr.add("Sally");
        arr.add("Tony");
        arr.add("Tony");
        arr.add("Tony");
        arr.add("Tony");

        IO.println(findAllIndices(arr, "Tony"));

    }

    public static ArrayList<Integer> findAllIndices(ArrayList<String> list, String target) {
        ArrayList<Integer> arrNumber = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                arrNumber.add(i);
            }
        }
        return arrNumber;
    }

}
