package test.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

@NullMarked
public class Reservation {
    private final LocalDate startDato;
    private final LocalDate slutDato;
    private final Deltager deltager;
    private final Ledsager ledsager;
    private final Konference konference;
    private final ArrayList<Hotel> hoteller;
    private final VærelsesType værelsesType;
    private final ArrayList<EkstraService> ekstraServices;


    public Reservation(Deltager deltager, Ledsager ledsager, Konference konference, LocalDate startDato, LocalDate slutDato, VærelsesType værelsesType) {
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.værelsesType = værelsesType;
        this.deltager = deltager;
        this.ledsager = ledsager;
        this.konference = konference;
        this.hoteller = new ArrayList<>();
        this.ekstraServices = new ArrayList<>();
    }


    public double pris() {
        double samletPris = 0;
        int antalOvernatninger = (int) DAYS.between(startDato, slutDato);
        int antalDage = antalOvernatninger + 1;

        for (Hotel hotel : hoteller) {
            double prisPrNat;
            if (værelsesType == VærelsesType.DOBBELTSENG) {
                prisPrNat = hotel.getDobbeltsengPris();
            } else {
                prisPrNat = hotel.getEnkeltsengPris();
            }
            for (EkstraService service : ekstraServices) {
                prisPrNat += service.getPris();
            }
            samletPris += prisPrNat * antalOvernatninger;
        }
        if (!deltager.isErForedragsHolder()) {
            samletPris += konference.getPris() * antalDage;
        }
        try {
            for (Udflugt udflugt : ledsager.getUdflugter()) {
                samletPris += udflugt.getPris();
            }
        }
        catch (NullPointerException exception) {
            exception.getMessage();
        }
        return samletPris;
    }

    public void addHotel(Hotel hotel) {
        this.hoteller.add(hotel);
    }

    public void addEkstraService(EkstraService ekstraService) {
        this.ekstraServices.add(ekstraService);
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public Deltager getDeltager() {
        return deltager;
    }

    public Konference getKonference() {
        return konference;
    }

    public VærelsesType getVærelsesType() {
        return værelsesType;
    }

    public ArrayList<EkstraService> getEkstraServices() {
        return ekstraServices;
    }

    public Ledsager getLedsager() {
        return ledsager;
    }



    public ArrayList<Hotel> getHoteller() {
        return hoteller;
    }
}
