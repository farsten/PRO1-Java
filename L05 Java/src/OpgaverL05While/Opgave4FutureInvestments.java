package OpgaverL05While;
//(Financial application: compute the future investment value) Write a method that
//computes future investment value at a given interest rate for a specified number
//of years. The future investment is determined using the formula in Programming
//Exercise 2.21.
//Use the following method header:
//public static double futureInvestmentValue(
//        double investmentAmount, double monthlyInterestRate,int years)
//        For example, futureInvestmentValue(10000, 0.05/12, 5) returns
//12833.59.
//Write a test program that prompts the user to enter the investment amount (e.g.,
//1,000) and the interest rate (e.g., 9%) and prints a table that displays future value
//for the years from 1 to 30, as shown below:

public class Opgave4FutureInvestments {
    void main() {
        String investPrompt = IO.readln("Hvor meget du vil investere: ");
        double investmentAmount = Double.parseDouble(investPrompt);

        String interestPrompt = IO.readln("Interest rate: ");
        double interestRate = Double.parseDouble(interestPrompt);

        String yearPrompt = IO.readln("Antal år: ");
        int years = Integer.parseInt(yearPrompt);

        double monthlyInterestRate = interestRate / 100 / 12;

        IO.println(String.format("%2s %-15s%n", "Years", "Future Value"));
        futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
    }

    public static void futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate,int years) {
        double totalAmount;
        int i = 1;
            while (i <= years) {
                totalAmount = investmentAmount * Math.pow(1 + monthlyInterestRate, i * 12);

                System.out.printf("%-15d %-15.2f%n", i, totalAmount);

                i++;
        }

    }
}
