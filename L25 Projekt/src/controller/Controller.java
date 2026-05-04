package controller;

import model.*;
import org.jspecify.annotations.NullMarked;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

@NullMarked
public class Controller {

    public static Forestilling lavForestilling(String navn, LocalDate start, LocalDate slut) {

        Forestilling forestilling = new Forestilling(navn, start, slut);
        Storage.addForestilling(forestilling);

        return forestilling;
    }

    public static Bestilling opretBestilling(
            LocalDate dato, Kunde kunde, Forestilling forestilling
            ) {
        Bestilling nyBestilling = new Bestilling(dato, kunde, forestilling);
        forestilling.addBestilling(nyBestilling);
        kunde.addBestilling(nyBestilling);
        return nyBestilling;
    }

    public static Bestilling opretBestillingMedPladser(
            Forestilling forestilling, Kunde kunde,
            LocalDate dato, ArrayList<Plads> pladser) {
        for (Plads plads : pladser) {
            if (!forestilling.erPladsenLedig1(plads.getRække(), plads.getNr(), dato)) {
                return null;
            }
        }
            Bestilling nyBestilling = opretBestilling(dato, kunde, forestilling);
            for (Plads plads1 : pladser) {
                nyBestilling.addPlads(plads1);
            }
        return nyBestilling;
        }

    public static Kunde lavKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.addKunde(kunde);
        return kunde;
    }

    public static Plads lavplads(int række, int nr, int pris, PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.addPlads(plads);
        return plads;
    }
}
