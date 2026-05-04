package ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Lav en applikation, der i main-metoden udskriver alle ulige tal mindre end 100 til en text fil.
public class App {
    void main() throws FileNotFoundException {

        String relativePath = "L26 EXCEPTIONS AND FILES/src/ex3/Numbers.txt";
        File out = new File(relativePath);
        try (Scanner scanner = new Scanner(System.in); PrintWriter writer = new PrintWriter(out)) {

            int number = 0;
            while (number < 100) {
                ++number;
                if (number % 2 == 1) {
                    writer.println(number);
                }
            }
        } catch (Exception e) {
            IO.println(e);
        }


    }
}
