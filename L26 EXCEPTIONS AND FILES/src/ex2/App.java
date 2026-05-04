package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Læs filen fra opgave 1 og indsæt tallene i en ArrayList<Integer> efterhånden som de
//indlæses.
//Udskriv dernæst tallene fra arraylisten i omvendt rækkefølge, dvs. 285, 177, …, 34 i
//consolvinduet.
public class App {
    void main() {

        String relativePath = "L26 EXCEPTIONS AND FILES/src/ex2/Numbers.txt";

        File in = new File(relativePath);



        try (Scanner scanner = new Scanner(in)) {
            ArrayList<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers.add(number);

            }
            for (int i = numbers.size() - 1; i >= 0; i--) {
                IO.println(numbers.get(i));
            }
        } catch (FileNotFoundException e) {
            IO.println(e);
        }


    }


}
