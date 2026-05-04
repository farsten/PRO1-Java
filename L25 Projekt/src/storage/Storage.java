package storage;

import model.Bestilling;
import model.Forestilling;
import model.Kunde;
import model.Plads;
import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;

@NullMarked
public class Storage {

    private static ArrayList<Forestilling> forestillinger = new ArrayList<>();
    private static ArrayList<Kunde> kunder = new ArrayList<>();
    private static ArrayList<Plads> pladser = new ArrayList<>();

    public static void addForestilling(Forestilling forestilling) {
        if (!forestillinger.contains(forestilling)) {
            forestillinger.add(forestilling);
        }
    }
    public static void addKunde(Kunde kunde) {
        if (!kunder.contains(kunde)) {
            kunder.add(kunde);
        }
    }
    public  static void addPlads(Plads plads) {
        if (!pladser.contains(plads)) {
            pladser.add(plads);
        }
    }

    public static ArrayList<Forestilling> getForestillinger() {
        return forestillinger;
    }

    public static ArrayList<Kunde> getKunder() {
        return kunder;
    }

    public static ArrayList<Plads> getPladser() {
        return pladser;
    }
}
