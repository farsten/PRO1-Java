package ex1;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;
    private TrainingPlan trainingPlan;


    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    /**
     * Return the fastest lap time.
     * Pre: The swimmer has at least one lap time.
     */
    public double bestLapTime() {

        double bestLapTime = Double.MAX_VALUE;
        for (double num : this.lapTimes) {
            if (bestLapTime > num) {
                bestLapTime = num;
            }
        }

        return bestLapTime;
    }
    public int allTrainingHours() {
     return trainingPlan.getWeeklyStrengthHours() + trainingPlan.getWeeklyWaterHours();
    }

}
