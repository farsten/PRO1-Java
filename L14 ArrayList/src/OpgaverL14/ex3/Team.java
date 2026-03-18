package OpgaverL14.ex3;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;


    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "A-team";

    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void printPlayers() {
        for (Player player : players) {
            IO.println("Navn: " + player.getName());
            IO.println("Alder: " + player.getAge());
            IO.println("Score: " + player.getScore());
            IO.println("=================");
        }
    }

    public int calcTotalScore() {
        int sumScore = 0;
        for (Player player : players) {
            sumScore += player.getScore();
        }
        return sumScore;
    }

    public int calcOldPlayersScore(int ageLimit) {
        int olderPlayersScore = 0;
        for (Player player : players) {
            if (player.getAge() > ageLimit) {
                olderPlayersScore += player.getScore();
            }
        }
        return olderPlayersScore;
    }

    public int maxScore() {
        int max = players.getFirst().getScore();
        for (Player player : players) {
            if (player.getScore() > max) {
                max = player.getScore();
            }
        }
        return max;
    }

    public ArrayList<String> bestPlayerNames() {
        ArrayList<String> bestPlayer = new ArrayList<>();
        int max = maxScore();
        for (Player player : players) {
            if (player.getScore() == max) {
                bestPlayer.add(player.getName());
            }
        }
        return bestPlayer;
    }
}
