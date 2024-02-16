public class CalisanTest {
    public static void main(String[] args) {
        // Calisan sınıfını kullanarak bir örnek oluştur ve test et
        Calisan calisan = new Calisan();
        calisan.setAd("Ahmet");
        calisan.setSoyad("Yılmaz");
        calisan.setMaas(5000);

        System.out.println("Çalışan: " + calisan.getAd() + " " + calisan.getSoyad());
        System.out.println("Maaş: " + calisan.getMaas() + " TL");
    }
}
