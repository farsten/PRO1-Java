package model;

import org.jspecify.annotations.NullMarked;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

@NullMarked
public class Forestilling {
    private String navn;
    private LocalDate start;
    private LocalDate slut;
    private final ArrayList<Bestilling> bestillinger;

    public Forestilling(String navn, LocalDate start, LocalDate slut) {
        this.navn = navn;
        this.start = start;
        this.slut = slut;
        this.bestillinger = new ArrayList<>();
    }

    public void addBestilling(Bestilling bestilling) {
        this.bestillinger.add(bestilling);
    }

    public ArrayList<Bestilling> getBestillinger() {
        return bestillinger;
    }

    @Override
    public String toString() {
        return navn + " (" + start + " til " + slut + ")";
    }

    public boolean erPladsenLedig1(int række, int nr, LocalDate dato) {
        for (Forestilling forestilling1 : Storage.getForestillinger()) {

            for (Bestilling bestilling : forestilling1.getBestillinger()) {

                for (Plads plads : bestilling.getPladser()) {
                    if (plads.getRække() == række && plads.getNr() == nr && bestilling.getDate().equals(dato)) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public boolean erPladsenLedig2(int række, int nr, LocalDate dato) {
        boolean ledig = true;
        for (int i = 0; ledig && i <= bestillinger.size(); i++) {
            Bestilling bestilling = bestillinger.get(i);

            if (bestilling.getDate().equals(dato)) {

                ArrayList<Plads> pladser = bestilling.getPladser();

                for (int j = 0; ledig && j < pladser.size(); j++) {
                    Plads plads = pladser.get(j);
                    if (plads.getRække() == række && plads.getNr() == nr) {
                        ledig = false;
                    }
                }
            }
        }
        return ledig;
    }

    public int antalBestiltePladserPåDag(LocalDate dato) {
        int antal = 0;
        for (Forestilling forestilling : Storage.getForestillinger()) {

            for (Bestilling bestilling : forestilling.getBestillinger()) {
                if (bestilling.getDate().equals(dato)) {
                    antal += bestilling.getPladser().size();
                }
            }
        }
            return antal;

    }
    public LocalDate succesDato(Forestilling forestilling) {
        int max = -1;
        LocalDate succesDato = null;
        for (Forestilling forestilling1 : Storage.getForestillinger()) {

            for (Bestilling bestilling : forestilling1.getBestillinger()) {
                if (bestilling.getForestilling().equals(forestilling)) {
                    int antal = forestilling.antalBestiltePladserPåDag(bestilling.getDate());

                    if (max < antal) {
                        max = antal;
                        succesDato = bestilling.getDate();
                    }

                }
            }
        }
        return succesDato;
    }
}


