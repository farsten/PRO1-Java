package test.gui;

import test.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

import static test.controller.Controller.*;

public class App {
    void main() {
        printTest();
    }
    public void printTest() {

        Konference k1 = createKonference("Hav og Himmel", "Odense", 1500,
                LocalDate.of(2026, 5, 4),
                LocalDate.of(2026, 5, 6),
                200);

        Udflugt byrundtur = createUdflugt(k1, "Byrundtur", 125, LocalDate.of(2026, 5, 4));
        Udflugt egeskov = createUdflugt(k1, "Egeskov", 75, LocalDate.of(2026, 5, 5));
        Udflugt trapholt = createUdflugt(k1, "Trapholt", 200, LocalDate.of(2026, 5, 6));

        Hotel h1 = createHotel("Den Hvide Svane", 1050, 1250);
        EkstraService wifi = createEkstraService(h1, 50, "WIFI");

        Deltager d1 = createDeltager("Finn Madsen", "", "", "", "",
                k1.getStartDato(), k1.getSlutDato(), false, DeltagerType.ANSAT);
        Reservation r1 = opretReservation(k1.getStartDato(), k1.getSlutDato(),
                VærelsesType.ENKELTSENG, d1, k1, null, null, null);
        IO.println("Finn Madsen samlet pris: " + r1.pris() + " kr.");

        Deltager d2 = createDeltager("Niels Petersen", "", "", "", "",
                k1.getStartDato(), k1.getSlutDato(), false, DeltagerType.ANSAT);
        Reservation r2 = opretReservation(k1.getStartDato(), k1.getSlutDato(),
                VærelsesType.ENKELTSENG, d2, k1, h1, null, null);
        IO.println("Niels Petersen samlet pris: " + r2.pris() + " kr.");


        Deltager d3 = createDeltager("Ulla Hansen", "", "", "", "",
                LocalDate.of(2026, 5, 4), LocalDate.of(2026, 5, 5), false, DeltagerType.ANSAT);
        ArrayList<Udflugt> ullaUdflugter = new ArrayList<>();
        ullaUdflugter.add(byrundtur);
        Reservation r3 = opretReservation(LocalDate.of(2026, 5, 4), LocalDate.of(2026, 5, 5),
                null, d3, k1, null, null, ullaUdflugter);
        createLedsager(r3, "Hans Hansen");
        IO.println("Ulla Hansen og " + r3.getLedsagere() + " pris: " + r3.pris() + " kr.");

        Deltager d4 = createDeltager("Peter Sommer", "", "", "", "",
                k1.getStartDato(), k1.getSlutDato(), false, DeltagerType.ANSAT);
        ArrayList<Udflugt> peterUdflugter = new ArrayList<>();
        peterUdflugter.add(egeskov);
        peterUdflugter.add(trapholt);
        ArrayList<EkstraService> peterEkstraService = new ArrayList<>();
        peterEkstraService.add(wifi);
        Reservation r4 = opretReservation(k1.getStartDato(), k1.getSlutDato(),
                VærelsesType.DOBBELTSENG, d4, k1, h1, peterEkstraService, peterUdflugter);
        createLedsager(r4, "Mie Sommer");
        IO.println("Peter Sommer og " + r4.getLedsagere() + " pris: " + r4.pris() + " kr.");

        Deltager d5 = createDeltager("Lone Jensen", "", "", "", "",
                k1.getStartDato(), k1.getSlutDato(), true, DeltagerType.ANSAT);
        ArrayList<Udflugt> loneUdflugter = new ArrayList<>();
        loneUdflugter.add(egeskov);
        loneUdflugter.add(byrundtur);
        ArrayList<EkstraService> loneEkstraService = new ArrayList<>();
        loneEkstraService.add(wifi);
        Reservation r5 = opretReservation(k1.getStartDato(), k1.getSlutDato(),
                VærelsesType.DOBBELTSENG, d5, k1, h1, loneEkstraService, loneUdflugter);

        createLedsager(r5, "Jan Madsen");
        IO.println("Lone Jensen og " + r5.getLedsagere() + " pris: " + r5.pris() + " kr.");
    }
}
