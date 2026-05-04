package gui;

import controller.Controller;
import javafx.application.Application;
import model.Plads;
import model.PladsType;
import org.jspecify.annotations.NullMarked;
import storage.Storage;

import java.time.LocalDate;

@NullMarked
public class App {
    void main() {
        initStorage();
        testPrint();
        Application.launch(GUI.class);

    }

    public void initStorage() {

        //EVITA FORESTILLING
        LocalDate evitaDatoStart = LocalDate.of(2023, 8, 10);
        LocalDate evitaDatoSlut = LocalDate.of(2023, 8, 20);

        Controller.lavForestilling("Evita", evitaDatoStart, evitaDatoSlut);

        //LYKKE PER FORESTILLING
        LocalDate perDatoStart = LocalDate.of(2023, 9, 1);
        LocalDate perDatoSlut = LocalDate.of(2023, 9, 10);

        Controller.lavForestilling("Lykke Per", perDatoStart, perDatoSlut);

        //CHESS FORESTILLING
        LocalDate chessDatoStart = LocalDate.of(2023, 8, 21);
        LocalDate chessDatoSlut = LocalDate.of(2023, 8, 30);

        Controller.lavForestilling("Chess", chessDatoStart, chessDatoSlut);

        //ANDERS KUNDE
        Controller.lavKunde("Anders Hansen", "11223344");

        //PETER KUNDE
        Controller.lavKunde("Peter Jensen", "12345678");

        //NIELS KUNDE
        Controller.lavKunde("Niels Madsen", "12341234");


        //Pladser

        for (int række = 1; række <= 15; række++) {
            for (int nr = 1; nr <= 20; nr++) {
                if (række <= 5) {
                    if (nr == 1 || nr == 2 || nr == 19 || nr == 20) {
                        Controller.lavplads(række, nr, 450, PladsType.STANDARD);
                    } else {
                        Controller.lavplads(række, nr, 500, PladsType.STANDARD);
                    }
                } else if (række <= 10) {
                    if (nr == 1 || nr == 2 || nr == 19 || nr == 20) {
                        Controller.lavplads(række, nr, 400, PladsType.STANDARD);
                    } else if (række == 10 && nr >= 8 && nr <= 12) {
                        Controller.lavplads(række, nr, 450, PladsType.KØRESTOL);
                    } else Controller.lavplads(række, nr, 450, PladsType.STANDARD);
                } else if (række == 11 && nr >= 8 && nr <= 12) {
                    Controller.lavplads(række, nr, 400, PladsType.EKSTRABEN);
                } else Controller.lavplads(række, nr, 400, PladsType.STANDARD);
            }
        }
    }

    public void testPrint() {
        IO.println("Forestillinger: ");
        IO.println(Storage.getForestillinger());
        IO.println();

        IO.println("Kunder:");
        IO.println(Storage.getKunder());
        IO.println();

        IO.println("Pladser");
        IO.println(Storage.getPladser());
        IO.println();

    }
}

