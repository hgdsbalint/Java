package Jarmuvek;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ElektromosAuto ea = new ElektromosAuto("BYD");
        HagyomanyosAuto ha = new HagyomanyosAuto("BMW", true);
        ElektromosRobogo er = new ElektromosRobogo("Suzuki");

        System.out.println(ea.toString());
        System.out.println(ha.toString());
        System.out.println(er.toString());
        er.motorBeindít();
        er.motorBeindít();
        System.out.println(er.toString());

    }
}
