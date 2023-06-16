package fenerSinemaJava;
import fenerSinemaJava.film;

import java.sql.Date;

import fenerSinemaJava.Salon;

class BiletRezervasyonBilgileri {
   
    private Salon salonlar;
    private film filmler;
    private String koltukNumarasi;
    private Date tarih;
    private String saat;
    private Seans seans;
    private String musteriAdSoyad;
    private int biletAdedi;

    public film getFilm() {
        return filmler;
    }

    public void setFilm(film film) {
        this.filmler = film;
    }

    public Salon getSalon() {
        return salonlar;
    }

    public void setSalon(Salon salon) {
        this.salonlar = salon;
    }

    public String getKoltukNumarasi() {
        return koltukNumarasi;
    }

    public void setKoltukNumarasi(String koltukNumarasi) {
        this.koltukNumarasi = koltukNumarasi;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public Seans getSeans() {
        return seans;
    }

    public void setSeans(Seans seans) {
        this.seans = seans;
    }

    public String getMusteriAdSoyad() {
        return musteriAdSoyad;
    }

    public void setMusteriAdSoyad(String musteriAdSoyad) {
        this.musteriAdSoyad = musteriAdSoyad;
    }

    public int getBiletAdedi() {
        return biletAdedi;
    }

    public void setBiletAdedi(int biletAdedi) {
        this.biletAdedi = biletAdedi;
    }

    public static void main(String[] args) {
    }
}

class Seans {
    private String saat;

    public Seans(String saat) {
        this.saat = saat;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }
}
