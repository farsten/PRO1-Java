package OpgaverL05While;

import static java.lang.IO.println;

//The FizzBuzz problem:
//Input a number N. Print integers one-to-N, but print “Fizz” if an integer is divisible by three,
//“Buzz” if an integer is divisible by five, and “FizzBuzz” if an integer is divisible by both three
//and five.
public class Opgave3FizzBuzz {
    void main() {
        String talPrompt = IO.readln("Giv et tal: ");
        int brugerTal = Integer.parseInt(talPrompt);

        tal(brugerTal);
    }

    public void tal(int brugerTal) {
        int i = 1;
        while (brugerTal >= i) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                IO.println("FizzBuzz");
            } else if (i % 5 == 0) {
                IO.println("Buzz");
            } else if (i % 3 == 0) {
                IO.println("Fizz");
            } else println(i);
            i++;

        }
    }
}
