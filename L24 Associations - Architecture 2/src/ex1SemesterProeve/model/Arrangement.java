package ex1SemesterProeve.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDateTime;
import java.util.ArrayList;

// Det skal være en arraylist<reseervation> og INGEN remove, kun ADD
public class Arrangement {
    private String navn;
    private boolean offentlig;
    private ArrayList<Reservation> reservationer;

    @NullMarked
    public Arrangement(String navn,  boolean offentlig) {
        this.navn = navn;
        this.offentlig = offentlig;
        this.reservationer = new ArrayList<>();
    }



    public void addReservation(Reservation reservation) {
        this.reservationer.add(reservation);
    }
    }
