package test.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;

@NullMarked
public class Udflugt {
    private final String navn;
    private final double pris;
    private final LocalDate dag;

    public Udflugt(String navn, double pris, LocalDate dag) {
        this.navn = navn;
        this.pris = pris;
        this.dag = dag;
    }
    public String getNavn() {
        return navn;
    }

    public double getPris() {
        return pris;
    }

    public LocalDate getDag() {
        return dag;
    }
}
