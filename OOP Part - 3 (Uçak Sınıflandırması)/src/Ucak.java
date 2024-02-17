public class Ucak {
    private String model;
    private int hiz;
    private int yolcuKapasitesi;

    public Ucak(String model, int hiz, int yolcuKapasitesi) {
        this.model = model;
        this.hiz = hiz;
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
}