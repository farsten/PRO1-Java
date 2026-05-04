package ex1SemesterProeve.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDateTime;
import java.util.ArrayList;

@NullMarked
public class Reservation {
    private LocalDateTime start;
    private LocalDateTime slut;
    private ArrayList<Plads> pladser = new ArrayList<>();


    public Reservation(LocalDateTime start, LocalDateTime slut) {
        this.start = start;
        this.slut = slut;
    }

    public void addPlads(Plads plads) {
        if (!pladser.contains(plads)) {
            pladser.add(plads);
            plads.addReservation(this);
        }
    }


    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getSlut() {
        return slut;
    }

    public void setSlut(LocalDateTime slut) {
        this.slut = slut;
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }

    public void setPladser(ArrayList<Plads> pladser) {
        this.pladser = pladser;
    }
}

