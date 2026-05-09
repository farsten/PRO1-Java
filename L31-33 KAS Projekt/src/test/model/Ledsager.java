package test.model;

import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;

@NullMarked
public class Ledsager {
    private final String navn;
    private final ArrayList<Udflugt> udflugter;

    public Ledsager(String navn) {
        this.navn = navn;
        this.udflugter = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return navn;
    }
    public ArrayList<Udflugt> getUdflugter() {
        return udflugter;
    }
    public void addUdflugt(Udflugt udflugt) {
        udflugter.add(udflugt);
    }
}
