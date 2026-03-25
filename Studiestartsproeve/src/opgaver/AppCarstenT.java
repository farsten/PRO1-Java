package opgaver;

import java.util.Scanner;

public class AppCarstenT {
    void main() {

        Scanner scanner = new Scanner(IO.readln("Indtast din daglige rejsebudget i danske kroner (DKK): "));

        double budget = scanner.nextInt();

        double USD = 651.15 / 100;
        double EUR = 747.26 / 100;
        double JPY = 4.09 / 100;

        IO.println("Dit budget i populære valutaer: ");
        IO.println(String.format("%.2f amerikanske dollar (USD)", budget / USD));
        IO.println(String.format("%.2f euro (EUR)",  budget / EUR));
        IO.println(String.format("%.2f japanske yen (JPY)", budget / JPY));
        IO.println();

        IO.println("Budgetvurdering/anbefaling: ");
        if (budget / EUR < 60) {
            IO.println("Lavt budget (f.eks. Sydøstasien eller Østeuropa)");
        } else if (budget / EUR > 60 && 120 > budget / EUR ) {
            IO.println("Medium budget (f.eks. Europa eller Latinamerika)");
        } else {
            IO.println("Højt budget (f.eks. Asien, Skandinavien eller USA)");
        }


    }
}
