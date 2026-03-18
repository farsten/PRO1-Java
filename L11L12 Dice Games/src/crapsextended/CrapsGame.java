package crapsextended;

public class CrapsGame {
    void main() {
        printRules();
        IO.println();

        Player player = new Player();
        IO.println("Playing Craps.");
        player.play();
        printResults(player);
        IO.println();

        IO.println("Thank you for playing Craps.");
    }

    public static void printRules() {
        IO.println("======================================================================================================");
        IO.println("Rules of Craps.");
        IO.println("""
                Spillet består af en række kast med to terninger. Udfaldet af et kast er summen af de to terningers
                øjne.\
                Det første kast kaldes ‘come out roll’. Spilleren vinder med det samme, hvis det første kast er 7
                eller 11, og taber med det samme, hvis det første kast er 2, 3 eller 12. Hvis spillerens første kast er
                4, 5, 6, 8, 9 eller 10, etableres dette tal som spillerens ‘point’. Spilleren bliver derefter ved med at
                kaste, indtil han enten kaster sit ‘point’ igen eller kaster 7. Kaster han 7, har han tabt. Kaster han
                sit ’point’, har han vundet.""");
        IO.println("======================================================================================================");
    }

    public static void printResults(Player player) {
        IO.println("Results");
        IO.println("-------");
        if (player.getFinished()) {
            if (player.getWin() && player.firstThrow) {
                IO.println("You won on the first roll!");
            } else if (!player.getWin() && player.getFinished()) {
                IO.println("You lost!");
            } else IO.println("You won!");
        }
        if (player.getGiveUp()) {
            IO.println("Thank you for playing!");
            IO.println("Total wins: " + player.getNumberWins());
            IO.println("Total losses: " + player.getNumberLosses());
        }
    }
}
