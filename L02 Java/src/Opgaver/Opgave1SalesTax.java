package Opgaver;

public class Opgave1SalesTax {
    void main() {
        String amountPromt = IO.readln("Indtast beløb: ");
        double amount = Double.parseDouble(amountPromt);
        double tax = amount * 6 / 100;
        double amountMedTax = amount + tax;
        IO.println("Resultatet er: " + amountMedTax);

    }
}
