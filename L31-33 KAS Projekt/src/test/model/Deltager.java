package test.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;

@NullMarked
public class Deltager {
    private final String navn;
    private final String adresse;
    private final String by;
    private final String land;
    private final String telefonNr;
    private String firmaNavn;
    private String firmaTlf;
    private final LocalDate ankomstDato;
    private final LocalDate afrejseDato;
    private final boolean erForedragsHolder;
    private final DeltagerType deltagerType;


    public Deltager(String navn, String adresse,
                    String by, String land, String telefonNr,
                    LocalDate ankomstDato, LocalDate afrejseDato,
                    boolean erForedragsHolder, DeltagerType deltagerType) {
        this.navn = navn;
        this.adresse = adresse;
        this.by = by;
        this.land = land;
        this.telefonNr = telefonNr;
        this.ankomstDato = ankomstDato;
        this.afrejseDato = afrejseDato;
        this.erForedragsHolder = erForedragsHolder;
        this.deltagerType = deltagerType;
        firmaNavn = "";
        firmaTlf = "";
    }

    public void setFirmaNavn(String firmaNavn) {
        this.firmaNavn = firmaNavn;
    }

    public void setFirmaTlf(String firmaTlf) {
        this.firmaTlf = firmaTlf;
    }

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getBy() {
        return by;
    }

    public String getLand() {
        return land;
    }

    public String getTelefonNr() {
        return telefonNr;
    }

    public String getFirmaNavn() {
        return firmaNavn;
    }

    public String getFirmaTlf() {
        return firmaTlf;
    }

    public LocalDate getAnkomstDato() {
        return ankomstDato;
    }

    public LocalDate getAfrejseDato() {
        return afrejseDato;
    }

    public boolean isErForedragsHolder() {
        return erForedragsHolder;
    }

    public DeltagerType getDeltagerType() {
        return deltagerType;
    }
}
