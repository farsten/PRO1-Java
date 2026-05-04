package ex1SemesterProeve.storage;

import ex1SemesterProeve.model.Arrangement;
import ex1SemesterProeve.model.Plads;
import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;

@NullMarked
public class Storage {

    private static ArrayList<Plads> pladser = new ArrayList<>();
    private static ArrayList<Arrangement> arrangementer = new ArrayList<>();

    public static void addPlads(Plads plads) {
        if (!pladser.contains(plads)) {
            pladser.add(plads);
        }
    }
    public static void addArrangement(Arrangement arrangement) {
        if (!arrangementer.contains(arrangement)) {
            arrangementer.add(arrangement);
        }
    }


    public static ArrayList<Plads> getPladser() {
        return pladser;
    }
}

