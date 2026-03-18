package OpgaverL04Metoder;

public class Opgave1HelTalMetoder {
    void main() {
        String talPrompt = IO.readln("Heltal: ");
        int tal = Integer.parseInt(talPrompt);

        IO.println(sign(tal));

    }

    public String sign(int num) {
        String signOfNumber;
        if (num < 0) {
            signOfNumber = "Negativ";
        } else if (num == 0) {
            signOfNumber = "0";
        } else signOfNumber = "Positiv";
        return signOfNumber;

    }
}



