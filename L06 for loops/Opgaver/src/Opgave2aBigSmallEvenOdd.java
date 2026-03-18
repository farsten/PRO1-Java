import java.util.Scanner;

public class Opgave2aBigSmallEvenOdd {
    //    I denne opgave skal der i alle spørgsmål indlæses et antal hele tal, alle mellem 1 og 99. Men
//    først skal indlæses et tal, som angiver, hvor mange tal, der efterfølgende indlæses.
//            (For dem som kender til break sætningen: break må ikke anvendes.)
//    a) Lav et program, der indlæser tallene (f.eks først 5 og dernæst 7 2 5 4 3 på én linje, hvor 5
//            angiver, at 5 tal skrives på samme linje) og udskriver det største tal, det mindste tal, antal lige
//    tal og antal ulige tal
    void main() {
        IO.println("Enter count of numbers:");
        int count = Integer.parseInt(IO.readln());

        IO.println("Enter some number 1..99 on one line: ");
        String input = IO.readln();
        Scanner scanner = new Scanner(input);

        int min = 100;
        int max = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; count > i; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            if (number % 2 != 0) {
                odd += 1;
            } else even += 1;

        }
        IO.println("The biggest number is: " + max);
        IO.println("The smallest number is: " + min);
        IO.println("The amount of odd number(s) is: " + odd);
        IO.println("The amount of even number(s) is: " + even);
    }
}

