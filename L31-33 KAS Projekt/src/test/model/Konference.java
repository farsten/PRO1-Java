package test.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;
import java.util.ArrayList;

@NullMarked
public class Konference {
    private final String navn;
    private final String adresse;
    private final double pris;
    private final LocalDate startDato;
    private final LocalDate slutDato;
    private final int maxAntal;
    private final ArrayList<Udflugt> udflugter;
    private final ArrayList<Reservation> reservationer;
    private final ArrayList<Hotel> hoteller;

    public Konference(String navn, String adresse, double pris, LocalDate startDato, LocalDate slutDato, int maxAntal) {
        this.navn = navn;
        this.adresse = adresse;
        this.pris = pris;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.maxAntal = maxAntal;
        this.udflugter = new ArrayList<>();
        this.reservationer = new ArrayList<>();
        this.hoteller = new ArrayList<>();
    }

    public void addUdflugt(Udflugt udflugt) {
        udflugter.add(udflugt);
    }
    public void removeUdflugt(Udflugt udflugt) {
        udflugter.remove(udflugt);
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getPris() {
        return pris;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public int getMaxAntal() {
        return maxAntal;
    }

    public ArrayList<Udflugt> getUdflugter() {
        return udflugter;
    }

    public ArrayList<Reservation> getReservationer() {
        return reservationer;
    }
    public  ArrayList<Hotel> getHoteller() {
        return hoteller;
    }
}
