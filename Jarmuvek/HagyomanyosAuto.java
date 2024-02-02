package Jarmuvek;

public class HagyomanyosAuto extends Jarmu {
    private boolean motorBekapcsolva =false;
     private int uzemanyagLiterben = 50;
     private boolean disellelMukodik;

    public HagyomanyosAuto(String marka, boolean disellelMukodik) {
        super(marka);
        this.disellelMukodik = disellelMukodik;
    }

    @Override
    public boolean motorBeindít() {
        if(uzemanyagLiterben==0) {
            return false;
        }else{
            this.uzemanyagLiterben = uzemanyagLiterben - 1;
            this.motorBekapcsolva = true;
            return true;
        }
    }
    public void uzemanyagUjratolt(){
        this.uzemanyagLiterben = 50;
    }

    @Override
    public String toString() {
        return "HagyomanyosAuto{" +
                "motorBekapcsolva=" + motorBekapcsolva +
                ", uzemanyagLiterben=" + uzemanyagLiterben +
                ", disellelMukodik=" + disellelMukodik +
                ", marka='" + marka + '\'' +
                '}';
    }
}
