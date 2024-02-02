package feladat;

public class Evszak {
    private int sorszam;
    private String nev;

    public Evszak(int sorszam, String nev) {
        this.sorszam = sorszam;
        this.nev = nev;
    }

    public int getSorszam() {
        return sorszam;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Evszak{" +
                "sorszam=" + sorszam +
                ", nev='" + nev + '\'' +
                '}';
    }
}
