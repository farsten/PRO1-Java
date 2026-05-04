package Opgave4Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
    void main() {
        Player p1 = new Player("Carsten", 169, 65, 61);
        Player p2 = new Player("Daniel", 177, 75, 10);
        Player p3 = new Player("Leon", 166, 55, 12);
        Player p4 = new Player("Juan", 167, 75, 10);
        Player p5 = new Player("Pedro", 168, 75, 17);
        Player p6 = new Player("Ella", 180, 75, 19);
        Player p7 = new Player("Jarl", 180, 75, 16);

        ArrayList<Player> players = new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6, p7));

        players.sort(Comparator.comparingInt(Player::getScoredGoals).reversed());

        IO.println("A: " + findPlayerLinear(players, 10));
        IO.println("B: " + findPlayerBinary(players, 10));
        IO.println("C: " + findPlayerName(players));
    }

    public Player findPlayerLinear(ArrayList<Player> players, int score) {

        for (Player p : players) {
            if (p.getScoredGoals() == score) {
                return p;
            }
        }

        return null;
    }

    public Player findPlayerBinary(ArrayList<Player> players, int score) {
        int left = 0;
        int right = players.size() - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int k = players.get(middle).getScoredGoals();

            if (k == score) {
                return players.get(middle);
            } else if (k > score) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return null;
    }

    public String findPlayerName(ArrayList<Player> players) {
        for (Player p : players) {
            if (p.getHeight() < 170 && p.getScoredGoals() > 50) {
                return p.getName();
            }
        }
        return null;
    }

}

