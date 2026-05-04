package ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Lav en applikation, der i main-metoden indlæser en række tal fra tastaturet (sluttende med -1),
//og skriver de indlæste tal til en tekstfil. Tallet -1 skal ikke skrives i filen. De øvrige tal skal
//være positive.
//Tallene skal skrives i filen efterhånden, som de indlæses (de skal altså ikke gemmes i en
//ArrayList).
import org.jspecify.annotations.NullMarked;

@NullMarked
public class App {
    void main() {

        String relativepath = "L26 EXCEPTIONS AND FILES/src/ex4/Numbers.txt";

        File output = new File(relativepath);

        try (Scanner scanner = new Scanner(System.in) ;
             PrintWriter writer = new PrintWriter(output)) {
            int number;
            while (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number != -1) {
                    writer.println(number);
                } else break;
            }
            IO.println("Program finished.");
        } catch (FileNotFoundException ex) {
            IO.println("File not found: " + ex);
        } catch (NoSuchElementException ex) {
            IO.println("No number given" + ex);
        }

    }
}
