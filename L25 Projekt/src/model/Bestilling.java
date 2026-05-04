package model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;
import java.util.ArrayList;

@NullMarked
public class Bestilling {
    private LocalDate date;
    private final ArrayList<Plads> pladser;
    private Kunde kunde;
    private final Forestilling forestilling;

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }


    public Bestilling(LocalDate date, Kunde kunde, Forestilling forestilling) {
        this.date = date;
        this.pladser = new ArrayList<>();
        this.kunde = kunde;
        this.forestilling = forestilling;
    }

    public void addPlads(Plads plads) {
        pladser.add(plads);
    }

    @Override
    public String toString() {
        return "Bestilling: " + pladser + ", " + kunde + ", "+ forestilling;
    }

    public int samletPris() {
       int pris = 0;
        for (Plads plads : pladser) {
            pris += plads.getPris();
        }
        return pris;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }
}
