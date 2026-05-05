package test.model;

import org.jspecify.annotations.NullMarked;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static java.time.temporal.ChronoUnit.DAYS;

@NullMarked
public class Reservation {
    private final LocalDate startDato;
    private final LocalDate slutDato;
    private final ArrayList<Deltager> deltagere;
    private final ArrayList<Ledsager> ledsagere;
    private final ArrayList<Konference> konferencer;
    private final ArrayList<Udflugt> udflugter;
    private final ArrayList<Hotel> hoteller;
    private final VærelsesType værelsesType;
    private final ArrayList<EkstraService> ekstraServices;


    public Reservation(LocalDate startDato, LocalDate slutDato, VærelsesType værelsesType) {
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.værelsesType = værelsesType;
        this.deltagere = new ArrayList<>();
        this.ledsagere = new ArrayList<>();
        this.konferencer = new ArrayList<>();
        this.udflugter = new ArrayList<>();
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
        for (Konference konference : konferencer) {
            for (Deltager deltager : deltagere) {
                if (!deltager.isErForedragsHolder()) {
                    samletPris += konference.getPris() * antalDage;
                }
            }
        }
        for (Udflugt udflugt : udflugter) {
            samletPris += udflugt.getPris();
        }
        return samletPris;
    }


    public void addDeltager(Deltager deltager) {
        this.deltagere.add(deltager);
    }

    public void addLedsager(Ledsager ledsager) {
        this.ledsagere.add(ledsager);
    }

    public void addKonference(Konference konference) {
        this.konferencer.add(konference);
    }

    public void addUdflugt(Udflugt udflugt) {
        this.udflugter.add(udflugt);
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

    public ArrayList<Deltager> getDeltagere() {
        return deltagere;
    }

    public ArrayList<Ledsager> getLedsagere() {
        return ledsagere;
    }

    public ArrayList<Konference> getKonferencer() {
        return konferencer;
    }

    public ArrayList<Udflugt> getUdflugter() {
        return udflugter;
    }

    public ArrayList<Hotel> getHoteller() {
        return hoteller;
    }
}
