package test.storage;

import test.model.Hotel;
import test.model.Konference;
import test.model.Deltager;
import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Konference> konferencer = new ArrayList<>();
    private static final ArrayList<Hotel> hoteller = new ArrayList<>();
    private static final ArrayList<Deltager> deltagere = new ArrayList<>();




    public static ArrayList<Konference> getKonferencer() {
        return new ArrayList<>(konferencer);
    }

    public static void addKonference(Konference konference) {
        konferencer.add(konference);
    }

    public static ArrayList<Hotel> getHoteller() {
        return new ArrayList<>(hoteller);
    }

    public static void addHotel(Hotel hotel) {
        hoteller.add(hotel);
    }
    
    public static ArrayList<Deltager> getDeltagere() {
        return new ArrayList<>(deltagere);
    }

    public static void addDeltager(Deltager deltager) {
        deltagere.add(deltager);
    }
}