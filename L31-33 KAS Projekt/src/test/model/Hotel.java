package test.model;

import org.jspecify.annotations.NullMarked;

import java.util.ArrayList;

@NullMarked
public class Hotel {
    private final String navn;
    private final ArrayList<EkstraService> ekstraServices;
    private final double enkeltsengPris;
    private final double dobbeltsengPris;


    public Hotel(String navn, double enkeltsengPris, double dobbeltsengPris) {
        this.navn = navn;
        this.ekstraServices = new ArrayList<>();
        this.enkeltsengPris = enkeltsengPris;
        this.dobbeltsengPris = dobbeltsengPris;
    }

    public void addEkstraService(EkstraService ekstraService) {
        ekstraServices.add(ekstraService);
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<EkstraService> getEkstraServices() {
        return ekstraServices;
    }

    public double getEnkeltsengPris() {
        return enkeltsengPris;
    }

    public double getDobbeltsengPris() {
        return dobbeltsengPris;
    }
}
