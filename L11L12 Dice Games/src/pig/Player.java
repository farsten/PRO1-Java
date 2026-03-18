package pig;

public class Player {

    private Die die;
    private int pointsThisTurn;
    private int sumPoints;
    private boolean turnOver;
    private boolean isPlayer1Win;
    private boolean gameIsOver;

    public Player() {
        die = new Die();
    }

    public void throwDie() {
        die.roll();
    }

    public void hold() {
        sumPoints += pointsThisTurn;
        pointsThisTurn = 0;
        turnOver = true;
    }

    public void startTurn() {
        turnOver = false;
        pointsThisTurn = 0;
    }

    public boolean isTurnOver() {
        return turnOver;
    }

    public int getSumPoints() {
        return sumPoints;
    }

    public boolean getIsPlayer1Win() {
        return isPlayer1Win;
    }

    public void play() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player currentPlayer = player1;
        while (!gameIsOver) {
            IO.println("=========");
            IO.println("New turn!");
            if (currentPlayer == player1) {
                IO.println("Player 1: ");
            } else IO.println("Player 2: ");
            IO.println("Current score: " + currentPlayer.getSumPoints());
            currentPlayer.startTurn();

            while (!currentPlayer.isTurnOver()) {
                IO.println("Roll or hold? (r/h)");
                String choice = IO.readln();

                if (choice.equalsIgnoreCase("r")) {
                    currentPlayer.throwDie();
                    IO.println("Rolled: " + currentPlayer.die.getFaceValue());
                    currentPlayer.pointsThisTurn += currentPlayer.die.getFaceValue();
                    IO.println("Total points this round: " + currentPlayer.pointsThisTurn);
                    if (currentPlayer.die.getFaceValue() == 1) {
                        currentPlayer.pointsThisTurn = 0;
                        currentPlayer.turnOver = true;
                    }
                } else {
                    currentPlayer.hold();
                }
            }

            IO.println("Total score: " + currentPlayer.getSumPoints());

            if (currentPlayer.getSumPoints() >= 100) {
                isPlayer1Win = currentPlayer == player1;
                gameIsOver = true;
            }

            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }

        }
    }
}