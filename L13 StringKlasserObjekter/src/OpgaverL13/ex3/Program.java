package OpgaverL13.ex3;

public class Program {
    void main() {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";
        String ord3 = ord1 + ord2.toLowerCase();

        IO.println("A: " + ord1.toUpperCase()); // A (store bogstaver)
        IO.println("B: " + ord2.toLowerCase()); // B (små bogstaver)
        IO.println("C: " + ord1 + " " + ord2);
        IO.println("D: " + ord3);
        IO.println("E: " + ord3.length());
        IO.println("F: " + ord1.substring(0, 7));
        IO.println("G: " + ord2.substring(3, 7));
        IO.println("H: " + ord3.substring(0, ord3.length() / 2));



    }
}
