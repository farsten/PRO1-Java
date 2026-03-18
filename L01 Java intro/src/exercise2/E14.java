package exercise2;

import javax.print.attribute.IntegerSyntax;

// Write a program that prints the balance of an account after the first, second, and third year.
//The account has an initial balance of $1,000 and earns 5 percent interest per year. //
public class E14 {
    void main() {

        int yearsOfInterest = 3;
        double interest = 1.05;
        double balance = 1000;
        for (int i = 0; i < yearsOfInterest; i++) {
            IO.println("År " + (i + 1) + ": " + balance + " kr");
            balance = balance * interest;

        }


//        IO.println("First year balance: $1000");
//        IO.println("Second year balance:$1050");
//        IO.println("Third year balance: $1102");
    }
}
