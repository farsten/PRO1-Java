package pigextended;

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
                " samlet når det givet antal point, har vundet."
        );
        IO.println("======================================================================================================");
    }


public static void printResults(Player game) {
    IO.println("Results");
    IO.println("-------");
    String result = (game.getIsPlayer1Win() ) ? "Player 1 wins!" : "Player 2 wins!";
    IO.println(result);
    IO.println("=============================");
    IO.println("Player 1 rolled " + game.getRollCountPlayer1() + " times!");
    IO.println("Player 1 rolled on average " + game.getRollCountAvgPlayer1() + " times!");
    IO.println("=============================");
    IO.println("Player 2 rolled " + game.getRollCountPlayer2() + " times!");
    IO.println("Player 2 rolled on average per turn " + game.getRollCountAvgPlayer2() + " times!");
}
}


