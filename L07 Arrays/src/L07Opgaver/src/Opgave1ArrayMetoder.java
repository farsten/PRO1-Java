import java.util.Arrays;

public class Opgave1ArrayMetoder {
    void main() {
        int[] exAnumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] exBnumbers = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};

        IO.print("A: ");
        exA(exAnumbers);

        IO.print("B: ");
        exB(exBnumbers);

        IO.print("C: ");
        exC();

        IO.print("D: ");
        exD();

        IO.print("E: ");
        exE();

        IO.print("F: ");
        exF();

        IO.print("G: ");
        exG();

        IO.print("H: ");
        exH();

    }

    public void exA(int[] array) {
        // Print array
        IO.println(Arrays.toString(array));
    }

    public void exB(int[] array) {
        // Print array
        IO.println(Arrays.toString(array));
    }

    public void exC() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        IO.println(Arrays.toString(array));


    }

    public void exD() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + i + i;
        }
        IO.println(Arrays.toString(array));


    }

    public void exE() {
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * (i + 1);


        }
        IO.println(Arrays.toString(array));
    }

    public void exF() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i % 2);
        }
        IO.println(Arrays.toString(array));
    }

    public void exG() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] += i % 5;
        }
        IO.println(Arrays.toString(array));

    }

    public void exH() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + i % 2 ;
        }
        IO.println(Arrays.toString(array));
    }
}