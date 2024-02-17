public class YolcuUcagi extends Ucak {
    private int ekonomiKoltukSayisi;
    private int businessKoltukSayisi;

    public YolcuUcagi() {
        super("Boeing 737", 988, 189); // Model, hız ve yolcu kapasitesi
        this.ekonomiKoltukSayisi = 169;
        this.businessKoltukSayisi = 20;
    }

    public int getEkonomiKoltukSayisi() {
        return ekonomiKoltukSayisi;
    }

    public void setEkonomiKoltukSayisi(int ekonomiKoltukSayisi) {
        this.ekonomiKoltukSayisi = ekonomiKoltukSayisi;
    }

    public int getBusinessKoltukSayisi() {
        return businessKoltukSayisi;
    }

    public void setBusinessKoltukSayisi(int businessKoltukSayisi) {
        this.businessKoltukSayisi = businessKoltukSayisi;
    }
}