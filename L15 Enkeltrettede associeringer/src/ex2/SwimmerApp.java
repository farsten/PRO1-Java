package ex2;

import java.util.ArrayList;
import java.util.List;

public class SwimmerApp {
    void main() {
        ArrayList<Double> lapTimesJan = new ArrayList<>(
                List.of(1.02, 1.01, 0.99, 0.98, 1.02, 1.04, 0.99)
        );
        Swimmer jan = new Swimmer("Jan", lapTimesJan);

        ArrayList<Double> lapTimesBo = new ArrayList<>(
                List.of(1.05, 1.01, 1.04, 1.06, 1.08, 1.04, 1.02)
        );
        Swimmer bo = new Swimmer("Bo", lapTimesBo);

        ArrayList<Double> lapTimesMikkel = new ArrayList<>(
                List.of(1.03, 1.01, 1.02, 1.05, 1.03, 1.06, 1.03)
        );
        Swimmer mikkel = new Swimmer("Mikkel", lapTimesMikkel);

        TrainingPlan tpA = new TrainingPlan('A', 16, 10);
        TrainingPlan tpB = new TrainingPlan('B', 10, 6);

        ArrayList<TrainingPlan> plans = new ArrayList<>();
        plans.add(tpA);
        plans.add(tpB);

        tpA.addSwimmer(jan);
        tpA.addSwimmer(bo);

        tpB.addSwimmer(mikkel);

        IO.println("Antal træningstimer på A: " + tpA.allTrainingHours());
        IO.println("Antal træningstimer på B: " + tpB.allTrainingHours());
        for (TrainingPlan trainingPlan : plans)
            for (Swimmer swimmer : trainingPlan.getSwimmers()) {
                IO.println(swimmer.getName() + "'s bedste lap time er: " + swimmer.getLapTimes());
            }
        int totalHours = 0;
        for (TrainingPlan trainingPlan : plans) {
            for (Swimmer swimmer : trainingPlan.getSwimmers()) {
                int hours = trainingPlan.allTrainingHours();
                IO.println("Navn: " + swimmer.getName());
                IO.println("Antal træningstimer om ugen: " + trainingPlan.allTrainingHours());
                totalHours += hours;
            }
        }
        IO.println("Træningstimer af alle svømmere om ugen: " + totalHours);
    }
}
