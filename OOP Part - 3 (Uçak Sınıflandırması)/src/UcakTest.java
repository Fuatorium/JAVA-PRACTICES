public class UcakTest {
    public static void main(String[] args) {

        KargoUcagi kargoUcagi = new KargoUcagi();
        System.out.println("Kargo Uçağı Modeli: " + kargoUcagi.getModel());
        System.out.println("Hız: " + kargoUcagi.getHiz() + " km/h");
        System.out.println("Yük Kapasitesi: " + kargoUcagi.getYukKapasitesi() + " Ton");
        System.out.println();


        SavasUcagi savasUcagi = new SavasUcagi();
        System.out.println("Savaş Uçağı Modeli: " + savasUcagi.getModel());
        System.out.println("Hız: " + savasUcagi.getHiz() + " km/h");
        System.out.println("Silah Sayısı: " + savasUcagi.getSilahSayisi());
        System.out.println();


        YolcuUcagi yolcuUcagi = new YolcuUcagi();
        System.out.println("Yolcu Uçağı Modeli: " + yolcuUcagi.getModel());
        System.out.println("Hız: " + yolcuUcagi.getHiz() + " km/h");
        System.out.println("Yolcu Kapasitesi: " + yolcuUcagi.getYolcuKapasitesi());
        System.out.println("Ekonomi Koltuk Sayısı: " + yolcuUcagi.getEkonomiKoltukSayisi());
        System.out.println("Business Koltuk Sayısı: " + yolcuUcagi.getBusinessKoltukSayisi());
    }
}
