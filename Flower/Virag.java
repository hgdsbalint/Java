package Flower;

import java.time.LocalDate;

public class Virag {
    private String virag;
    private int raktaromLevoMennyiseg;
    private LocalDate vagasDatuma;
    private String besorolas;
    private int ar;

    public Virag(String virag, int raktaromLevoMennyiseg, LocalDate vagasDatuma, String besorolas, int ar) {

        this.virag = virag;
        this.raktaromLevoMennyiseg = raktaromLevoMennyiseg;
        this.vagasDatuma = vagasDatuma;
        this.besorolas = besorolas;
        this.ar = ar;
    }

    public String getVirag() {
        return virag;
    }

    public int getRaktaromLevoMennyiseg() {
        return raktaromLevoMennyiseg;
    }

    public LocalDate getVagasDatuma() {
        return vagasDatuma;
    }

    public String getBesorolas() {
        return besorolas;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Virag{" +
                "virag='" + virag + '\'' +
                ", raktaromLevoMennyiseg=" + raktaromLevoMennyiseg +
                ", vagasDatuma=" + vagasDatuma +
                ", besorolas='" + besorolas + '\'' +
                ", ar=" + ar +
                '}';
    }
}
