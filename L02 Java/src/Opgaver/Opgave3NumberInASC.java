package Opgaver;
/*Løs følgende opgave:
Enter 2 numbers and display them in ascending order.
Ekstra:
Enter 3 numbers and display them in ascending order.*/

public class Opgave3NumberInASC {
    void main() {
        String number1Prompt = IO.readln("Indtast et tal: ");
        double number1 = Double.parseDouble(number1Prompt);

        String number2Prompt = IO.readln("Indtast et tal: ");
        double number2 = Double.parseDouble(number2Prompt);

        if (number1 >= number2)
            IO.print("Rækkefølgen er: " + number2 + ", " + number1);

        else IO.print("Rækkefølgen er: " + number1 + ", " + number2);

    }
}
