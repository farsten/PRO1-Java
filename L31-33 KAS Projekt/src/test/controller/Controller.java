package test.controller;

import test.model.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    private static final ArrayList<Konference> konferencer = new ArrayList<>();
    private static final ArrayList<Hotel> hoteller = new ArrayList<>();


    //Konference
    public static Konference createKonference(String navn, String adresse, double pris, LocalDate start, LocalDate slut, int maxAntal) {
        Konference konference = new Konference(navn, adresse, pris, start, slut, maxAntal);
        konferencer.add(konference);
        return konference;
    }

    //Hotel og EkstraService
    public static Hotel createHotel(String navn, double enkeltsengPris, double dobbeltsengPris) {
        Hotel hotel = new Hotel(navn, enkeltsengPris, dobbeltsengPris);
        hoteller.add(hotel);
        return hotel;
    }

    //Ekstra EkstraService for test
    public static EkstraService createEkstraService(Hotel hotel, double pris, String navn) {
        EkstraService service = new EkstraService(pris, navn);
        hotel.addEkstraService(service);
        return service;
    }

    //Deltager
    public static Deltager createDeltager(String navn, String adresse, String by, String land, String telefonNr,
                                   LocalDate ankomstDato, LocalDate afrejseDato,
                                   boolean erForedragsHolder, DeltagerType deltagerType) {
        return new Deltager(navn, adresse, by, land, telefonNr, ankomstDato, afrejseDato, erForedragsHolder, deltagerType);
    }


    //Reservation, selve tilmeldingen
    public static Reservation opretReservation(LocalDate start, LocalDate slut, VærelsesType type,
                                        Deltager deltager, Konference konference,
                                        Hotel hotel, ArrayList<EkstraService> valgteEkstraService, ArrayList<Udflugt> valgteUdflugter) {

        Reservation reservation = new Reservation(start, slut, type);
        reservation.addDeltager(deltager);
        reservation.addKonference(konference);


        if (hotel != null) {
            reservation.addHotel(hotel);
        }
        if (valgteEkstraService != null) {
            for (EkstraService ekstraService : valgteEkstraService) {
                reservation.addEkstraService(ekstraService);
            }
        }
        if (valgteUdflugter != null) {
            for (Udflugt udflugt : valgteUdflugter) {
                reservation.addUdflugt(udflugt);
            }
        }




        return reservation;
    }

    //Udflugt
    public static Udflugt createUdflugt(Konference konference, String navn, double pris, LocalDate dato) {
        Udflugt udflugt = new Udflugt(navn, pris, dato);
        konference.addUdflugt(udflugt);
        return udflugt;
    }

    //Ledsager
    public static Ledsager createLedsager(Reservation reservation, String navn) {
        Ledsager ledsager = new Ledsager(navn);
        reservation.addLedsager(ledsager);
        return ledsager;
    }
}