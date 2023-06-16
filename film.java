package fenerSinemaJava;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

 class Film {
    private String filmAdi;
    private int filmYili;
    private String filmTuru;
    private List<String> seanslar;

    public Film(String filmAdi, int filmYili, String filmTuru, List<String> seanslar) {
        this.filmAdi = filmAdi;
        this.filmYili = filmYili;
        this.filmTuru = filmTuru;
        this.seanslar = seanslar;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public int getFilmYili() {
        return filmYili;
    }

    public String getFilmTuru() {
        return filmTuru;
    }
    
    public List<String> getSeanslar() {
        return seanslar;
    }
}

public class film {
    public static void main(String[] args) {
        List<String> seanslar = getSeanslar();
        
        Film film1 = new Film("Esaretin Bedeli", 1991, "Drama/Polisiye", seanslar);
        Film film2 = new Film("Müzede Bir Gece", 2006, "Fantastik", seanslar);
        Film film3 = new Film("Yeşil Rehber", 2018, "Dram/Komedi", seanslar);
        Film film4 = new Film("Luka", 2021, "Macera/Komedi", seanslar);
        Film film5 = new Film("Soul", 2020, "Çocuk/Komedi", seanslar);
        
        
        

        System.out.println("Film: " + film1.getFilmAdi());
        System.out.println("Yıl: " + film1.getFilmYili());
        System.out.println("Tür: " + film1.getFilmTuru());
        System.out.println("Seanslar: " + film1.getSeanslar());
        System.out.println();

        System.out.println("Film: " + film2.getFilmAdi());
        System.out.println("Yıl: " + film2.getFilmYili());
        System.out.println("Tür: " + film2.getFilmTuru());
        System.out.println("Seanslar: " + film2.getSeanslar());
        System.out.println();

        System.out.println("Film: " + film3.getFilmAdi());
        System.out.println("Yıl: " + film3.getFilmYili());
        System.out.println("Tür: " + film3.getFilmTuru());
        System.out.println("Seanslar: " + film3.getSeanslar());
        System.out.println();

        System.out.println("Film: " + film4.getFilmAdi());
        System.out.println("Yıl: " + film4.getFilmYili());
        System.out.println("Tür: " + film4.getFilmTuru());
        System.out.println("Seanslar: " + film4.getSeanslar());
        System.out.println();

        System.out.println("Film: " + film5.getFilmAdi());
        System.out.println("Yıl: " + film5.getFilmYili());
        System.out.println("Tür: " + film5.getFilmTuru());
        System.out.println("Seanslar: " + film5.getSeanslar());
    }

    public static List<String> getSeanslar() {
        List<String> seanslar = new ArrayList<>();
        seanslar.add("12:00");
        seanslar.add("13:15");
        seanslar.add("14.30");
        seanslar.add("15:45");
        seanslar.add("17:00");
        seanslar.add("18:00");
        seanslar.add("19:15");
        seanslar.add("21:00");
        return seanslar;
    }
}



