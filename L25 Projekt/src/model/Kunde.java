package model;

import org.jspecify.annotations.NullMarked;


import java.time.LocalDate;
import java.util.ArrayList;

@NullMarked
public class Kunde {
    private String navn;
    private String mobil;
    private final ArrayList<Bestilling> bestillinger;

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
        this.bestillinger = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return navn + " and " + mobil;
    }

    public void addBestilling(Bestilling bestilling) {
        this.bestillinger.add(bestilling);
    }

    public ArrayList<Plads> bestiltePladserTilForestillingPåDag(Forestilling forestilling, LocalDate dato) {
        ArrayList<Plads> resultat = new ArrayList<>();

        for (Bestilling b : this.bestillinger) {

            if (b.getForestilling().equals(forestilling) && b.getDate().equals(dato)) {
                resultat.addAll(b.getPladser());
            }
        }
        return resultat;
    }
}
