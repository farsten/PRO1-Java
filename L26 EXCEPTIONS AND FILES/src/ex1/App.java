package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Lav en applikation, der i main-metoden læser denne fil og udskriver det dobbelte af tallene i
//consolvinduet, dvs.
//68 -40 0 400 354 570 (på en eller flere linjer).
public class App {
    void main() {

        String relativePath = "L26 EXCEPTIONS AND FILES/src/ex1/Numbers.txt";

        File in = new File(relativePath);

        try (Scanner scanner = new Scanner(in)) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                number = number * 2;
                IO.println(number);
            }
        } catch (FileNotFoundException e) {
            IO.println(e);
        }



    }


}
