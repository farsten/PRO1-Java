package OpgaverL14.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {

        Player p1 = new Player("Leon", 19);
        Player p2 = new Player("Ella", 21);
        Player p3 = new Player("Bobby", 26);
        Player p4 = new Player("Midas", 38);


        ArrayList<Player> players = new ArrayList<>(List.of(p1, p2, p3));

        Team team = new Team("Best Team");
        team.addPlayer(p1);
        team.addPlayer(p2);
        team.addPlayer(p3);

        p1.setScore(23);
        p2.setScore(25);
        p3.setScore(25);
        p4.setScore(21);
        IO.println(team);
        team.addPlayer(p4);
        IO.println(players);
        team.printPlayers();
        IO.println("Samlet score: " + team.calcTotalScore());
        IO.println("Spillere over aldersgrænse: " + team.calcOldPlayersScore(35));
        IO.println("Højeste score: " + team.maxScore());
        IO.println("Spillere med den højeste score: " + team.bestPlayerNames());


    }
}
