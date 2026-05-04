package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Skriv en ny applikation med følgende metoder:
//a) public int max(String pathName)
//som finder maximum for tallene i filen med stien pathName.
//Metoden skal fange eventuelle exceptions og udskrive dem.
import org.jspecify.annotations.NullMarked;



@NullMarked
public class App {
    void main() {

IO.println("A1: " + max("L26 EXCEPTIONS AND FILES/src/ex5/test.txt"));
IO.println("A1: " + min("L26 EXCEPTIONS AND FILES/src/ex5/test.txt"));
IO.println("A2: " + max("L26 EXCEPTIONS AND FILES/src/ex5/test1.txt"));
IO.println("A2: " + min("L26 EXCEPTIONS AND FILES/src/ex5/test1.txt"));

IO.println("B: " + min("L26 EXCEPTIONS AND FILES/src/ex5/test.txt"));
    }

    private int min(String pathName) {
        int min = Integer.MAX_VALUE;
        File file = new File(pathName);
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                int number = scan.nextInt();
                if (number < min) {
                    min = number;
                }
            }
        } catch (NoSuchElementException ex) {
            IO.println("Tallet eksistere ikke " + ex.getMessage());
        } catch (FileNotFoundException e) {
            IO.println("Filen kan ikke findes " + e.getMessage());
        }
        return min;
    }

    public int max(String pathName) {
        int max = Integer.MIN_VALUE;
        File file = new File(pathName);
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNext()) {
                int number = (scan.nextInt());
                if (max < number) {
                    max = number;
                }
            }
        } catch (Exception ex) {
            IO.println(ex);
        }
        return max;
    }
}


