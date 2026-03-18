import java.util.Scanner;

public class DaysFromNow {

    public void main() {
        Scanner input = new Scanner(System.in);

        IO.println("Angiv dagnummer og antallet af dage fra nu: ");
        int today = input.nextInt();
        int daysFromNow = input.nextInt();

        int weekNumber = (today + daysFromNow) % 7;
        String finalResult = "";

        if (weekNumber == 0)
            finalResult = "Søndag";
        else if (weekNumber == 1)
            finalResult = "Mandag";
        else if (weekNumber == 2)
            finalResult = "Tirsdag";
        else if (weekNumber == 3)
            finalResult = "Onsdag";
        else if (weekNumber == 4)
            finalResult = "Torsdag";
        else if (weekNumber == 5)
            finalResult = "Fredag";
        else
            finalResult = "Lørdag";

        IO.println("Resultatet er: " + finalResult);

    }
}
