package ex2;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + " " + lapTimes;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }
    public double bestLapTime() {

        double bestLapTime = Double.MAX_VALUE;
        for (double num : this.lapTimes) {
            if (bestLapTime > num) {
                bestLapTime = num;
            }
        }

        return bestLapTime;
    }
}
