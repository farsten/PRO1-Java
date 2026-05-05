package test.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;

@NullMarked
public class Udflugt {
    private String navn;
    private double pris;
    private LocalDate dag;
    private boolean isTillaegFrokost;

    public Udflugt(String navn, double pris, LocalDate dag) {
        this.navn = navn;
        this.pris = pris;
        this.dag = dag;
    }
    public String getNavn() {
        return navn;
    }
    public void setIstillaegFrokost(boolean isTillaegFrokost) {
        this.isTillaegFrokost = isTillaegFrokost;
    }

    public double getPris() {
        return pris;
    }

    public LocalDate getDag() {
        return dag;
    }

    public boolean isTillaegFrokost() {
        return isTillaegFrokost;
    }
}
