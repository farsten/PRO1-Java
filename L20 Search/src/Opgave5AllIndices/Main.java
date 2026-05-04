package Opgave5AllIndices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    void main() {
        Scanner scanner = new Scanner(IO.readln("Skriv en sætning: "));
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" "); // splitter hvert ord
        ArrayList<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, words); //tilføjer hvert ord fra arrayen til arraylisten

        IO.println(findAllIndices(wordsList, "jeg"));

    }

    public static ArrayList<Integer> findAllIndices(ArrayList<String> list, String target) {
        ArrayList<Integer> arrNumber = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(target)) {
                arrNumber.add(i);
            }
        }
        return arrNumber;
    }

}
