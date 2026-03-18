package rolltwodice;

public class RollTwoDiceGame {
    void main() {
        printRules();
        IO.println();

        Player player = new Player();
        IO.println("Playing RollTwoDice.");
        player.play();

        printResults(player);
        IO.println();
        IO.println("Thank you for playing RollTwoDice.");
    }

    public static void printRules() {
        IO.println("=====================================================");
        IO.println("Rules of RollTwoDice:");
        IO.println("The player throws two dice as long as they wants.");
        IO.println("=====================================================");
    }

    public static void printResults(Player player) {
        IO.println("Results");
        IO.println("-------");
        IO.println("Roll count: " + (int) player.getRollCount());
        IO.println("Total sum: " + (int) player.getTotalSum());
        IO.println("Same value count: " + player.getSameEyes());
        IO.println("Largest sum: " + player.getLargestSum());
        IO.println("Average sum: " + player.getAvgSum());
        int[] values = player.getValues();
        for (int i = 1; i < player.getValuesLength(); i++) {
            if (values[i] > 0) {
                if (values[i] > 1) {
                    IO.println(i + " occurs " + values[i] + " times!");
                } else {
                    IO.println(i + " occurs " + values[i] + " time!");
                }
            }
        }
    }
}





