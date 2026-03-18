package Opgaver;
/*
Input loan amount, annual interest rate and number of years,
calculate and print monthly payment and total payment.
Monthly payment = loan amount * interestRatePrMonth / denumerator,
where denumerator = 1 - 1 / (1 + interestRatePrMonth) ^ numberOfmonths).
Use Math.pow(a, b) to calculate a ^ b (example: 2 ^ 3 = 8).
*/



public class Opgave2ComputeLoan {
    void main() {
       String loanAmountPromt = IO.readln("Indtast lån: ");
        double loanAmount = Double.parseDouble(loanAmountPromt);

       String yearlyTaxPromt = IO.readln("Indtast årlig rente: ");
        double yearlyTax = Double.parseDouble(yearlyTaxPromt);

       String amountOfYearsPrompt = IO.readln("Indtast antal år: ");
        double amountOfYears = Double.parseDouble(amountOfYearsPrompt);

        double numberOfMonths = amountOfYears * 12;

        double interestRatePrMonth = yearlyTax / 12 / 100;
        double denumerator = 1 - 1 / Math.pow(1 + interestRatePrMonth, numberOfMonths);
        double monthlyPayment = loanAmount * interestRatePrMonth / denumerator;
        double totalPayment = monthlyPayment * numberOfMonths;
        IO.println("Månedlig betaling: " + monthlyPayment);
        IO.println("Total betaling: " + totalPayment);


    }
}
