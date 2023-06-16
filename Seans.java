package fenerSinemaJava;
import fenerSinemaJava.sinemasalonu;
import fenerSinemaJava.film;

import java.time.LocalDate;
import java.time.LocalTime;




 class Film {
    private String ad;
    private int yil;
    private String tur;

    public Film(String ad, int yil, String tur) {
        this.ad = ad;
        this.yil = yil;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public void filmBilgileriniGoster() {
        System.out.println("Film Adı: " + ad);
        System.out.println("Yıl: " + yil);
        System.out.println("Tür: " + tur);
    }
}

 class Salon {
    private String ad;
    private int kapasite;

    public Salon(String ad, int kapasite) {
        this.ad = ad;
        this.kapasite = kapasite;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }
}

 class SeansBilgileri {
    private Film film;
    private Salon salon;
    private String koltukNumarasi;
    private LocalDate tarih;
    private LocalTime saat;

    public SeansBilgileri(Film film, Salon salon, String koltukNumarasi, LocalDate tarih, LocalTime saat) {
        this.film = film;
        this.salon = salon;
        this.koltukNumarasi = koltukNumarasi;
        this.tarih = tarih;
        this.saat = saat;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public String getKoltukNumarasi() {
        return koltukNumarasi;
    }

    public void setKoltukNumarasi(String koltukNumarasi) {
        this.koltukNumarasi = koltukNumarasi;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public LocalTime getSaat() {
        return saat;
    }

    public void setSaat(LocalTime saat) {
        this.saat = saat;
    }
}



