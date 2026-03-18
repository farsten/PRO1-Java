import java.util.Scanner;

public class resttalFinder {
void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Angiv 2 tal og find resttallet:");
    int firstNumber = input.nextInt();
    int secondNumber = input.nextInt();
    IO.println("Resttallet er: " + firstNumber % secondNumber);
}
}
