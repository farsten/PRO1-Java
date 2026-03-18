public class Opgave1cSumAfGraenserForLoops {
        void main() {
        String lowerPrompt = IO.readln("Det nedre interval: ");
        int lower = Integer.parseInt(lowerPrompt);

        String upperPrompt = IO.readln("Det øvre interval: ");
        int upper = Integer.parseInt(upperPrompt);

        IO.println("Summen af de lige tal i intervallet er: " + sumEvenInts(lower, upper));
    }

        public int sumEvenInts(int lower, int upper) {

            if (lower % 2 != 0) {    //Hvis at lower ikke er et lige tal
                lower++;
            }


            int sum;
            for (sum = 0; lower <= upper; lower += 2) {
                sum = sum + lower;
            }
            return sum;
        }

}
