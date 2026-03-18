package pigextended;

public class Player {
    private Die die1;
    private Die die2;
    private int sumPoints;
    private boolean turnOver;
    private boolean isPlayer1Win;
    private boolean gameIsOver;
    private int pointsThisTurn;

    private double rollCountPlayer1;
    private double rollCountPlayer2;
    private double countPlayer1;
    private double countPlayer2;

    public Player() {
        die1 = new Die();
        die2 = new Die();
    }

    public void throwDie() {
        die1.roll();
        die2.roll();
    }

    public void play() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player currentPlayer = player1;

        int capacity = Integer.parseInt(IO.readln("Hvor mange point vil I spille til? "));

        while (!gameIsOver) {
            IO.println("=========");
            IO.println("New turn!");
            IO.println("=========");
            if (currentPlayer == player1) {
                IO.println("Player 1: ");
                countPlayer1++;
            } else IO.println("Player 2: ");
            countPlayer2++;
            currentPlayer.startTurn();

            while (!currentPlayer.isTurnOver()) {

                IO.println("Roll or hold? (r/h)");
                String choice = IO.readln();
                if (choice.equalsIgnoreCase("r")) {
                    throwDie();

                    IO.println("Rolled: " + die1.getFaceValue() + " and " + die2.getFaceValue());
                    if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1) {
                        IO.println("Your score has been reset!");
                        currentPlayer.sumPoints = 0;
                        currentPlayer.pointsThisTurn = 0;
                        currentPlayer.turnOver = true;
                    } else if (die1.getFaceValue() == 1 || die2.getFaceValue() == 1) {
                        currentPlayer.pointsThisTurn = 0;
                        currentPlayer.turnOver = true;
                    } else currentPlayer.pointsThisTurn += die1.getFaceValue() + die2.getFaceValue();


                    if (currentPlayer.getPointSNoOne() >= capacity) {
                        isPlayer1Win = currentPlayer == player1;
                        gameIsOver = true;
                        currentPlayer.turnOver = true;
                        break;
                    }
                } else {
                    currentPlayer.hold();
                }


                if (choice.equalsIgnoreCase("r") && (currentPlayer == player1)) {
                    rollCountPlayer1++;
                } else if (choice.equalsIgnoreCase("r") && (currentPlayer == player2)) {
                    rollCountPlayer2++;
                }

                IO.println("Total score: " + currentPlayer.getPointSNoOne());

            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }

        }


    }


    public void hold() {
        sumPoints += pointsThisTurn;
        pointsThisTurn = 0;
        turnOver = true;
    }

    public int getPointSNoOne() {
        return pointsThisTurn + sumPoints;
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

    public double getRollCountPlayer1() {
        return rollCountPlayer1;
    }

    public double getRollCountPlayer2() {
        return rollCountPlayer2;
    }

    public double getRollCountAvgPlayer1() {
        return rollCountPlayer1 / countPlayer1;
    }

    public double getRollCountAvgPlayer2() {
        return rollCountPlayer2 / countPlayer2;
    }
}

