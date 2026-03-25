package Opgave1UnevenNumber;

import java.util.Scanner;

//Solve exercise 1, 2 and 3 using a while loop and no return statement inside the loop!
//Exercise 1
//Write a linear search method that returns, whether an uneven number exists in an array. The
//method must return true or false, and take an array of integer numbers as parameter.
public class Opgave1 {
    void main() {

        int antalTal = Integer.parseInt(IO.readln("Hvor mange tal vil du give? "));
        Scanner scanner = new Scanner(IO.readln("Giv " + antalTal + " tal: "));
        int[] arr = new int[antalTal];
        for (int i = 0; i < antalTal; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        IO.println(UnevenSearch(arr));
    }

    public boolean UnevenSearch(int[] arr) {
        boolean found = false;
        int i = 0;
        while (!found && i < arr.length) {
            if (arr[i] % 2 == 1) {
                found = true;
            } else i++;
        }
        return found;
    }
}
