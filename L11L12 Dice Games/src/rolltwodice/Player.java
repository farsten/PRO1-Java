package rolltwodice;


public class Player {
    private Dice dice1;
    private Dice dice2;
    private int rollCount;
    private int totalSum;
    private int sameEyes;
    private int largestSum;
    private int[] values = new int[7];

    public Player() {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }

    public double getRollCount() {
        return rollCount;
    }

    public void throwDice() {
        dice1.roll();
        dice2.roll();

        rollCount++;

        totalSum += sumDice();

        if (dice1.getFaceValue() == dice2.getFaceValue()) {
            sameEyes++;
        }
        if (largestSum < sumDice()) {
            largestSum = sumDice();
        }
        values[dice1.getFaceValue()]++;
        values[dice2.getFaceValue()]++; //+1 på hvert tal i array
    }

    public int sumDice() {
        return dice1.getFaceValue() + dice2.getFaceValue();
    }

    public double getTotalSum() {
        return totalSum;
    }

    public int getSameEyes() {
        return sameEyes;
    }

    public int getLargestSum() {
        return largestSum;
    }

    public int getValuesLength() {
        return values.length;
    }

    public int[] getValues() {
        return values;
    }

    public double getAvgSum() {
        return getTotalSum() / getRollCount();
    }

    public void play() {
        IO.println("Roll?");
        IO.readln();

        boolean finished = false;
        while (!finished) {
            throwDice();
            IO.println(String.format("Rolling... %d and %d (sum is: %d)", dice1.getFaceValue(), dice2.getFaceValue(), sumDice()));

            IO.println("Roll again? (Y/n)");
            String again = IO.readln();
            if (again.equalsIgnoreCase("n")) {
                finished = true;
            }
        }
    }
}


