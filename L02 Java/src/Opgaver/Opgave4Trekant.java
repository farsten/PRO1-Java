package Opgaver;

public class Opgave4Trekant {
    void main() {
        String lengthPrompt = IO.readln("Indtast længde på trekant: ");
            double length = Double.parseDouble(lengthPrompt);

            double area = Math.sqrt(3) / 4 * (Math.pow(length, 2));
            double volume = length * area;
            IO.println("Area: " + area);
            IO.println("Volume: " + volume);
    }
}
