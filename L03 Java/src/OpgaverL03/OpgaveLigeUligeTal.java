package OpgaverL03;

public class OpgaveLigeUligeTal {
    void main() {
        String talPrompt = IO.readln("Angiv et tal: ");
        int tal = Integer.parseInt(talPrompt);

        if (tal % 2 == 0) IO.println("Du er sku da skide lige!: " + tal);
        else IO.println("Du er sku da ikke særlige lige!: " + tal);

    }
}
