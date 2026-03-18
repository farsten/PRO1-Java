package OpgaverL14.ex1;

import java.util.ArrayList;
import java.util.List;

public class Names {
    void main() {
        ArrayList<String> names = new ArrayList<>();

        names.addAll(List.of("Hans", "Viggo", "Jens", "Bente", "Bent"));

        names.add(2, "Jane");

        names.remove(1);
        names.add(0, "Pia");
        names.add("Ib");
        names.set(2, "Hansi");
        IO.println(names.size());

        IO.println(names);
        IO.println("The length of each name using for loop: ");
        for (int i = 0; i < names.toArray().length; i++) {
            IO.print(names.get(i).length() + " ");
        }
        IO.println();
        IO.println("The length of each name using for each loop");
        for (String name : names) {
            IO.print(name.length() + " ");
        }

    }
}
