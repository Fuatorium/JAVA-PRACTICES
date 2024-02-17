public class KargoUcagi extends Ucak {
    private double yukKapasitesi;

    public KargoUcagi() {
        super("Antonov 124", 865, 0); // Model, hız ve yolcu kapasitesi
        this.yukKapasitesi = 150; // Ton cinsinden
    }

    public double getYukKapasitesi() {
        return yukKapasitesi;
    }

    public void setYukKapasitesi(double yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }
}