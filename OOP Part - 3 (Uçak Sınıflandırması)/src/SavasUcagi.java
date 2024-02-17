public class SavasUcagi extends Ucak {
    private int silahSayisi;

    public SavasUcagi() {
        super("Lockheed Martin F-35 Lightning II", 2100, 0); // Model, hız ve yolcu kapasitesi
        this.silahSayisi = 4;
    }

    public int getSilahSayisi() {
        return silahSayisi;
    }

    public void setSilahSayisi(int silahSayisi) {
        this.silahSayisi = silahSayisi;
    }
}