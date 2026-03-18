package pig;

public class PigGame {
    void main() {
        printRules();
        Player game = new Player();
        game.play();

        printResults(game);
        IO.println("Thank you for playing Pig.");

    }

    public static void printRules() {
        IO.println("======================================================================================================");
        IO.println("Rules of Pig.");
        IO.println("Første spiller kaster en terning, indtil han enten kaster 1 eller beslutter sig for at stoppe. Hvis han" +
                " slår en 1’er, får han ingen point i denne runde. Hvis han beslutter sig for at stoppe, inden har slår" +
                "en 1’er, lægges summen af alle hans kast i denne runde sammen med hans samlede antal point," +
                "og turen går videre til næste spiller. Derefter skiftes spillerne til at kaste. Den første spiller, der" +
                " samlet når 100 point, har vundet."
        );
        IO.println("======================================================================================================");
    }


public static void printResults(Player game) {
    IO.println("Results");
    IO.println("-------");
    if (game.getIsPlayer1Win()) {
        IO.println("Player 1 wins!");
    } else IO.println("Player 2 wins!");

}
}

