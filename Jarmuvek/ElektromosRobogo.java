package Jarmuvek;

public class ElektromosRobogo extends Jarmu{
    private boolean motorBekapcsolva = false;
    private double akkuToltottseg = 1.0;

    public ElektromosRobogo(String marka) {
        super(marka);
    }


    @Override
    public boolean motorBeindít() {
        if(akkuToltottseg == 0){
            return false;
        }
        else{
            this.akkuToltottseg = akkuToltottseg-1;
            return true;
        }
    }

    @Override
    public void motorKikapcsol() {
        super.motorKikapcsol();
    }
    public void akkuFeltolt(){
        this.akkuToltottseg = 1.0;
    }

    @Override
    public String toString() {
        return "ElektromosRobogo{" +
                "motorBekapcsolva=" + motorBekapcsolva +
                ", akkuToltottseg=" + akkuToltottseg +
                ", marka='" + marka + '\'' +
                '}';
    }
}
