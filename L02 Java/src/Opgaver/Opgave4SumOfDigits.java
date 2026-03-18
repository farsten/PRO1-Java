package Opgaver;

import java.awt.*;

public class Opgave4SumOfDigits {
    void main() {
        String numberPrompt = IO.readln("Indtast nummer mellem 0 - 1000: ");
            int number = Integer.parseInt(numberPrompt);

            if ((number > 0) && (number < 1000)) {
                int firstNumber = number % 10;
                int secondNumber = number / 10 % 10;
                int thirdNumber = number / 100 % 10;
                IO.println("Summen er cifrene er: " + (firstNumber + secondNumber + thirdNumber));
            }
                else IO.println("Tallet er ikke imellem 0 - 1000");





    }

}
