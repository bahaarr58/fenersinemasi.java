package fenerSinemaJava;
import java.util.List;

 class SinemaSalonu {
    private List<Salon> salonlar;
    private int koltukKapasitesi;
    private int koltukNumarasi;

    public List<Salon> getSalonlar() {
        return salonlar;
    }

    public void setSalonlar(List<Salon> salonlar) {
        this.salonlar = salonlar;
    }

    public int getKoltukKapasitesi() {
        return koltukKapasitesi;
    }

    public void setKoltukKapasitesi(int koltukKapasitesi) {
        this.koltukKapasitesi = koltukKapasitesi;
    }

    public int getKoltukNumarasi() {
        return koltukNumarasi;
    }

    public void setKoltukNumarasi(int koltukNumarasi) {
        this.koltukNumarasi = koltukNumarasi;
    }
}

public class sinemasalonu {
    public static void main(String[] args) {
        SinemaSalonu sinemaSalonu = new SinemaSalonu();
        sinemaSalonu.setKoltukKapasitesi(100);
        sinemaSalonu.setKoltukNumarasi(1);

       
        Salon salon1 = new Salon();
        salon1.setSalonAdi("Salon 1");
        salon1.setKapasite(sinemaSalonu.getKoltukKapasitesi());

        Salon salon2 = new Salon();
        salon2.setSalonAdi("Salon 2");
        salon2.setKapasite(sinemaSalonu.getKoltukKapasitesi());

        Salon salon3 = new Salon();
        salon3.setSalonAdi("Salon 3");
        salon3.setKapasite(sinemaSalonu.getKoltukKapasitesi());

        sinemaSalonu.setSalonlar(List.of(salon1, salon2, salon3));

        System.out.println("Sinema Salonu Bilgileri:");
        System.out.println("Koltuk Kapasitesi: " + sinemaSalonu.getKoltukKapasitesi());
        System.out.println("Koltuk Numarası: " + sinemaSalonu.getKoltukNumarasi());
        System.out.println("Salonlar:");
        for (Salon salon : sinemaSalonu.getSalonlar()) {
            System.out.println("Salon Adı: " + salon.getSalonAdi());
            System.out.println("Kapasite: " + salon.getKapasite());
            System.out.println();
        }
    }
}

 class Salon {
    private String salonAdi;
    private int kapasite;

    public String getSalonAdi() {
        return salonAdi;
    }

    public void setSalonAdi(String salonAdi) {
        this.salonAdi = salonAdi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }
}
