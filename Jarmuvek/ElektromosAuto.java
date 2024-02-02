package Jarmuvek;

public class ElektromosAuto extends Jarmu implements Elektromos{
    private boolean motorBekapcsolva = false;
    private double akkuToltottseg = 100.0;

    public ElektromosAuto(String marka) {
        super(marka);
    }


    @Override
    public boolean motorBeindít() {
        if(akkuToltottseg ==0){
            return false;
        }
        else {
            this.akkuToltottseg = akkuToltottseg-1;
            this.motorBekapcsolva = true;
            return true;
        }
    }
    public void akkuFeltolt(){
        this.akkuToltottseg = 100.0;
    }

    @Override
    public String toString() {
        return "ElektromosAuto{" +
                "motorBekapcsolva=" + motorBekapcsolva +
                ", akkuToltottseg=" + akkuToltottseg +
                ", marka='" + marka + '\'' +
                '}';
    }
}