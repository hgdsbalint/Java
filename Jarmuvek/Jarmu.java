package Jarmuvek;

public abstract class Jarmu {
    protected String marka;

    public Jarmu(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public abstract boolean motorBeindít();

    public void motorKikapcsol() {

    }
}
