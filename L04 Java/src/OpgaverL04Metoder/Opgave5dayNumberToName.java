package OpgaverL04Metoder;

import java.util.Scanner;

public class Opgave5dayNumberToName {

    public void main() {
        String todayPrompt = IO.readln("Angiv dagnummer (0-6): ");
        int today = Integer.parseInt(todayPrompt);

        String fremtidPrompt = IO.readln("Angiv antal dage i fremtiden: ");
        int fremtid = Integer.parseInt(fremtidPrompt);

        IO.println("Fremtidsdagen er: " + dag(today, fremtid));

    }
    public String dag(int today, int daysFromNow) {
        String finalResult;
        int weekNumber = (today + daysFromNow) % 7;
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
return finalResult;


    }
}
