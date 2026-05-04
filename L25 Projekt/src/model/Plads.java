package model;

import org.jspecify.annotations.NullMarked;

public class Plads {
    private int række;
    private int nr;
    private int pris;
    private PladsType pladsType;

    @NullMarked
    public Plads(int række, int nr, int pris, PladsType pladsType) {
        this.række = række;
        this.nr = nr;
        this.pris = pris;
        this.pladsType = pladsType;
    }

    public int getRække() {
        return række;
    }

    public int getNr() {
        return nr;
    }

    public int getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return "\n" +
                "række: " + række +
                ", nr: " + nr +
                ", pris: " + pris +
                ", pladsType: " + pladsType;
    }
}
