package ex1SemesterProeve.gui;

import ex1SemesterProeve.controller.Controller;
import ex1SemesterProeve.model.Arrangement;
import ex1SemesterProeve.model.Område;
import ex1SemesterProeve.model.Plads;
import ex1SemesterProeve.model.Reservation;
import javafx.application.Application;
import org.jspecify.annotations.NullMarked;

import java.time.LocalDateTime;

@NullMarked
public class App {
    void main() {
        initStorage();
        Application.launch(GUI.class);

    }

    public static void initStorage() {

        Plads p1 = Controller.lavPlads(1, Område.TURNERING);
        Plads p2 = Controller.lavPlads(2, Område.TURNERING);
        Plads p3 = Controller.lavPlads(3, Område.STANDARD);
        Plads p4 = Controller.lavPlads(4, Område.STANDARD);
        Plads p5 = Controller.lavPlads(5, Område.BØRNE);
        Plads p6 = Controller.lavPlads(6, Område.VIP);

        Arrangement DOTA = Controller.lavArrangement("Dota 2 tournament", true);
        Arrangement CSGO = Controller.lavArrangement("CSGO tournament", false);




        //første reservation
        LocalDateTime dstart1 = LocalDateTime.of(2019, 8, 12, 20, 0);
        LocalDateTime dslut1 = LocalDateTime.of(2019, 8, 12, 23, 0);


        Reservation r1 = Controller.opretReservation(dstart1, dslut1, DOTA);
        r1.addPlads(p1);
        r1.addPlads(p2);




        //anden reservation
        LocalDateTime dstart2 = LocalDateTime.of(2019, 8, 13, 19, 0);
        LocalDateTime dslut2 = LocalDateTime.of(2019, 8, 14, 6, 0);
        Reservation r2 = Controller.opretReservation(dstart2, dslut2, DOTA);
        r2.addPlads(p3);
        r2.addPlads(p4);

        //tredje reservation
        LocalDateTime dstart3 = LocalDateTime.of(2019, 8, 14, 19, 0);
        LocalDateTime dslut3 = LocalDateTime.of(2019, 8, 15, 6, 0);

        Reservation r3 = Controller.opretReservation(dstart3, dslut3, CSGO);
        r3.addPlads(p6);

    }
}