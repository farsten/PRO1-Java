import java.util.Scanner;

public class Opgave2dAmountOfTimesEach {
    //    Lav et program, der indlæser tallene og udskriver de tal, som forekommer flere gange efter
//    hinanden med antal forekomster i parentes.
//    Indtastes først 14 og dernæst 1 3 3 3 4 5 5 5 5 6 6 1 3 3, skal programmet udskrive 3(3) 5(4)
//            6(2) 3(2).
    void main() {
        IO.println("Enter count of numbers:");
        int numberPrompt = Integer.parseInt(IO.readln());

        IO.println("Enter some numbers 1..99 on one line: ");
        String input = IO.readln();
        Scanner scanner = new Scanner(input);
        int lastnumber = 0;
        int count = 1;
        for (int i = 0; numberPrompt > i; i++) {
            int number = scanner.nextInt();
            if (number == lastnumber) {
                count += 1;
            }

            if ((number != lastnumber) && (count > 1)) {
                IO.print(lastnumber + "(" + count + ") ");
                count = 1;
            }
            lastnumber = number;

        }
                if (count > 1) {
                    IO.print(lastnumber + "(" + count + ") ");
                }
}
}