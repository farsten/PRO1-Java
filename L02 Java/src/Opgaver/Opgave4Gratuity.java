package Opgaver;

public class Opgave4Gratuity {
    void main() {
        String subTotalPrompt = IO.readln("Indtast subtotal: ");
            double subTotal = Double.parseDouble(subTotalPrompt);

        String gratuityPrompt = IO.readln("Indtast gratuity rate i procent: ");
            double gratuityRate = Double.parseDouble(gratuityPrompt);

            double gratuity = subTotal * gratuityRate / 100;
            double totalAmount = gratuity + subTotal;

            IO.println("Gratuity er: " + gratuity);
            IO.println("Totalbeløbet er: " + totalAmount);



    }
}
