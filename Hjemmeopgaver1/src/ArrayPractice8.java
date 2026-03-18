public class ArrayPractice8 {
    void main() {
        String talPrompt = IO.readln("Angiv et tal og se om det er systemet!: ");
        int tal = Integer.parseInt(talPrompt);

        int[] arr = {4, 9, 2, 7, 9};

boolean InSystem = false;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == tal)
               InSystem = true;
           else InSystem = false;

        }
if (InSystem) {
        IO.println("Dit tal " + tal + " er i systemet!");}
else 
        IO.println("Dit tal " + tal + " er desværre ikke i systemet :(");
    }
}
