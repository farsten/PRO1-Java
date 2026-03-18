package Opgaver;

public class Opgave5DiskriminantRoots {
    void main() {

//        b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
//        equation has two real roots. If it is zero, the equation has one root. If it is negative,
//        the equation has no real roots.
//        Write a program that prompts the user to enter values for a, b, and c and displays
//        the result based on the discriminant. If the discriminant is positive, display two
//        roots. If the discriminant is 0, display one root. Otherwise, display “The equation
//        has no real roots.”
//        Note you can use Math.
//        EKSEMPLER MED KUN 1 LØSNING:
//        A: 1
//        B: -4
//        C: 4
//
        String aValuePrompt = IO.readln("Indsæt A-værdi: ");
        double a = Double.parseDouble(aValuePrompt);
        String bValuePrompt = IO.readln("Indsæt B-værdi: ");
        double b = Double.parseDouble(bValuePrompt);
        String cValuePrompt = IO.readln("Indsæt C-værdi: ");
        double c = Double.parseDouble(cValuePrompt);

        double d = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
        if (d > 0) IO.print("Der er to løsninger: " + r1 + " og " + r2);

        else if (d == 0) IO.print("Der er én løsning: " + r1);
        else IO.println("Der findes ingen løsninger");

    }

}
