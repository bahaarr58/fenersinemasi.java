package fenerSinemaJava;
import java.util.Scanner;

class BiletRezervasyonBilgileri {
    private String film;
    private String salon;
    private String koltukNumarasi;
    private int tarih;
    private String saat;
    private String musteriAdSoyad;
    private int biletAdedi;

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getKoltukNumarasi() {
        return koltukNumarasi;
    }

    public void setKoltukNumarasi(String koltukNumarasi) {
        this.koltukNumarasi = koltukNumarasi;
    }

    public int getTarih() {
        return tarih;
    }

    public void setTarih(int tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
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
}

public class fenerSinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Film Seçiniz:");
        System.out.println("1. Esaretin Bedeli");
        System.out.println("2. Müzede Bir Gece");
        System.out.println("3. Yeşil Rehber");
        System.out.println("4. Luka");
        System.out.println("5. Soul");
        System.out.print("Film numarasını giriniz: ");
        int filmNumarasi = scanner.nextInt();
        


        String secilenFilm;
        switch (filmNumarasi) {
            case 1:
                secilenFilm = "Esaretin Bedeli";
                break;
            case 2:
                secilenFilm = "Müzede Bir Gece";
                break;
            case 3:
                secilenFilm = "Yeşil Rehber";
                break;
            case 4:
                secilenFilm = "Luka";
                break;
            case 5:
                secilenFilm = "Soul";
                break;
            default:
                System.out.println("Geçersiz film numarası!");
                return;
        }

        System.out.print("Salon: ");
        String salon = scanner.next();

        System.out.print("Koltuk Numarası: ");
        String koltukNumarasi = scanner.next();

        System.out.print("Tarih (YYMMDD): ");
        int tarih = scanner.nextInt();

        System.out.print("Saat: ");
        String saat = scanner.next();//stringe çevir.

        System.out.print("Müşteri Adı Soyadı: ");
        String musteriAdSoyad = scanner.next();

        System.out.print("Bilet Adedi: ");
        int biletAdedi = scanner.nextInt();

        BiletRezervasyonBilgileri rezervasyon = new BiletRezervasyonBilgileri();
        rezervasyon.setFilm(secilenFilm);
        rezervasyon.setSalon(salon);
        rezervasyon.setKoltukNumarasi(koltukNumarasi);
        rezervasyon.setTarih(tarih);
        rezervasyon.setSaat(saat);
        rezervasyon.setMusteriAdSoyad(musteriAdSoyad);
        rezervasyon.setBiletAdedi(biletAdedi);

        System.out.println("----- Rezervasyon Bilgileri -----");
        System.out.println("Film: " + rezervasyon.getFilm());
        System.out.println("Salon: " + rezervasyon.getSalon());
        System.out.println("Koltuk Numarası: " + rezervasyon.getKoltukNumarasi());
        System.out.println("Tarih: " + rezervasyon.getTarih());
        System.out.println("Saat: " + rezervasyon.getSaat());
        System.out.println("Müşteri Adı Soyadı: " + rezervasyon.getMusteriAdSoyad());
        System.out.println("Bilet Adedi: " + rezervasyon.getBiletAdedi());
    }
}
