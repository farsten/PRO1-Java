package ex1SemesterProeve.model;

import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;

@NullMarked
public class Plads {
    private int nr;
    private Område område;
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private static int standardTimePris = 50;


    public Plads(int nr, Område område) {
        this.nr = nr;
        this.område = område;
    }

    public void addReservation(Reservation reservation) {
        if (!reservations.contains(reservation)) {
            reservations.add(reservation);
            reservation.addPlads(this);
        }
    }

    public double pris(int timer) {
        return switch (område) {
            case VIP -> (standardTimePris * 1.25) * timer;
            case BØRNE -> (standardTimePris * 0.8) * timer;
            case TURNERING -> (standardTimePris * 1.1) * timer;
            default -> standardTimePris * timer;
        };
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Område getOmråde() {
        return område;
    }

    public void setOmråde(Område område) {
        this.område = område;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public static int getStandardTimePris() {
        return standardTimePris;
    }

    public static void setStandardTimePris(int standardTimePris) {
        Plads.standardTimePris = standardTimePris;
    }

    @Override
    public String toString() {
        return "Plads nr " + nr + ", " + område;
    }
}
