package ex1;

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

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(jan);
        swimmers.add(bo);
        swimmers.add(mikkel);

        TrainingPlan planA = new TrainingPlan('A', 20, 10);
        TrainingPlan planB = new TrainingPlan('B', 10, 5);

        jan.setTrainingPlan(planA);
        bo.setTrainingPlan(planA);
        mikkel.setTrainingPlan(planB);


        for (Swimmer swimmer : swimmers) {
            IO.println(swimmer.getName() + "'s antal timer om ugen: " + swimmer.allTrainingHours());
        }
        IO.println();
        for (Swimmer swimmer : swimmers) {
            IO.println(swimmer.getName() + "'s bedste tid: " + swimmer.bestLapTime());
        }
        IO.println();
        int totalHours = 0;

        for (Swimmer swimmer : swimmers) {
            int hours = swimmer.allTrainingHours();

            IO.println(swimmer.getName() + " træner i alt " + hours + " timer om ugen.");

            totalHours += hours;
        }

       IO.println("Svømmerne træner i alt " + totalHours + " timer om ugen.");
    }
}
