import java.util.Scanner;

public class Opgave2bSumOfNumbers {
//    Lav et program, der indlæser tallene og udskriver den løbende sum.
//    Indtastes først 4 og dernæst 1 7 2 9, skal programmet udskrive 1 8 10 19
void main() {
    IO.println("Enter count of numbers:");
    int count = Integer.parseInt(IO.readln());

    IO.println("Enter some number 1..99 on one line: ");
    String input = IO.readln();
    Scanner scanner = new Scanner(input);

    int sum = 0;
    for (int i = 0; count > i; i++) {
        int number = scanner.nextInt();
        sum += number;
        IO.print(sum + " ");

    }
    }
}
