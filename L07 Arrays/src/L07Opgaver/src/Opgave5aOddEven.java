import java.util.Scanner;

public class Opgave5aOddEven {
    //    (The number of even numbers and odd numbers) Write a program that reads ten integers,
//    and then display the number of even numbers and odd numbers. Assume that
//    the input ends with 0. Here is the sample run of the program:
    void main() {

        Scanner scanner = new Scanner(IO.readln("Angiv 1-10 heltal og slut med \"0\": "));
        int[] t = new int[11];

        int i;
        for (i = 0; i < t.length; i++) {
            t[i] = scanner.nextInt();
            if (t[i] == 0) {
                break;
            }

        }
        evenOdd(t, i);

    }
        public void evenOdd(int[] t, int count) {
            int evenCount = 0;
            int oddCount = 0;

            for (int k = 0; k < count; k++) {
                if ((t[k] % 2 == 0)) {
                    evenCount++;
                } else oddCount++;


            }


            IO.println("Lige tal: " + evenCount);
            IO.println("Ulige tal: " + oddCount);
        }


    }


