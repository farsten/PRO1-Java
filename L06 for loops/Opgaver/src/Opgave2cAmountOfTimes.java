import java.util.Scanner;

public class Opgave2cAmountOfTimes {
    //    Lav et program, der indlæser tallene og udskriver det største tal og hvor mange gange det
//    forekommer.
//    Indtastes først 8 og dernæst 3 5 2 5 4 5 5 2 er det største tal 5 og det forekommer 4 gange.
//            (Hint: Brug to variable: max til det største tal og count til antal forekomster.)
    void main() {
        IO.println("Enter count of numbers:");
        int numberPrompt = Integer.parseInt(IO.readln());

        IO.println("Enter some numbers 1..99 on one line: ");
        String input = IO.readln();
        Scanner scanner = new Scanner(input);

        int count = 0;
        int max = 0;
        for (int i = 0; numberPrompt > i; i++) {
            int number = scanner.nextInt();
            if (max == number) {
                count += 1;
            }

            if (number > max) {
                max = number;
                count = 1;
            }


        }
        IO.println("Det største tal er " + max + " og det kom " + count + " gange");
    }

}


