package test.model;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class Ledsager {
    private String navn;

    public Ledsager(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
