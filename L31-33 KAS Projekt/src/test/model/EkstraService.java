package test.model;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class EkstraService {
    private final double pris;
    private final String navn;

    public EkstraService(double pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }
}
