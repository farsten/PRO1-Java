package ex1SemesterProeve.controller;
//Tilføj klassen Controller i en pakke controller. Klassen skal indeholde metoder til at oprette
//arrangementer, reservationer og pladser, samt til at skabe sammenhænge imellem disse. Alle
//oprettede objekter skal tilføjes til Storage. Lav alle metoder og felter i denne klasse statiske.

import ex1SemesterProeve.model.Arrangement;
import ex1SemesterProeve.model.Område;
import ex1SemesterProeve.model.Plads;
import ex1SemesterProeve.model.Reservation;
import ex1SemesterProeve.storage.Storage;
import org.jspecify.annotations.NullMarked;

import java.time.LocalDateTime;

@NullMarked
public class Controller {

    public static Arrangement lavArrangement(String navn, boolean offentlig) {

        Arrangement arrangement = new Arrangement(navn, offentlig);
        Storage.addArrangement(arrangement);

        return arrangement;
    }

    public static Plads lavPlads(int nr, Område område) {

        Plads plads = new Plads(nr, område);
        Storage.addPlads(plads);
        return plads;
    }

    public static void addPladsTilReservation(Plads plads, Reservation reservation) {
        reservation.addPlads(plads);
        plads.addReservation(reservation);

    }


    public static Reservation opretReservation(LocalDateTime start, LocalDateTime slut, Arrangement arrangement) {
        Reservation reservation = new Reservation(start, slut);
        arrangement.addReservation(reservation);

        return reservation;
    }
}

