package OpgaverL03;

//Lav et program, der indlæser et heltal fra tastaturet og udskriver negativ, 0 eller
//positiv, afhængig af om det indlæste tal er <, == eller > end 0.
public class Opgave1HelTal {
    void main() {
        String talPrompt = IO.readln("Indtast et helt tal: ");
        int tal = Integer.parseInt(talPrompt);

        if (tal > 0)
            IO.println("Dit tal er godt nok positivt ;)");
        else if (tal == 0)
            IO.println("Dit tal er sku da bare nul");
        else
            IO.println("Du da bare negativ!!");
    }
}
