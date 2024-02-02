package feladat;

public class Cipo {
    private String modellszam;
    private double meret;
    private String szin;
    private Evszak evszak;

    public Cipo(String modellszam, double meret, String szin, Evszak evszak) {
        this.modellszam = modellszam;
        this.meret = meret;
        this.szin = szin;
        this.evszak = evszak;
    }

    public String getModellszam() {
        return modellszam;
    }

    public double getMeret() {
        return meret;
    }

    public String getSzin() {
        return szin;
    }

    public Evszak getEvszak() {
        return evszak;
    }

    @Override
    public String toString() {
        return "Cipo{" +
                "modellszam='" + modellszam + '\'' +
                ", meret=" + meret +
                ", szin='" + szin + '\'' +
                ", evszak=" + evszak +
                '}';
    }
}
