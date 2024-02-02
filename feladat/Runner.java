package feladat;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Cipo> cipo = new ArrayList<>();
        cipo.add(new Cipo("S32R", 42.5, "zöld", new Evszak(2, "Tavasz")));
        cipo.add(new Cipo("S42R", 40, "kék", new Evszak(2, "Tél")));
        cipo.add(new Cipo("S52R", 43.5, "zöld", new Evszak(2, "Tavasz")));

        HashMap<Evszak, ArrayList<Cipo>> ujjlust = new HashMap<>();
        for (Cipo c: cipo) {
            ArrayList<Cipo> c1 ;
            if(ujjlust.containsKey(c.getEvszak())){
                c1 = ujjlust.get(c.getEvszak());
            }
            else {
                c1 = new ArrayList<>();
            }
            c1.add(c);
            ujjlust.put(c.getEvszak(), c1);
        }



















        /*
        HashMap<Evszak, ArrayList<Cipo>> ujlist = new HashMap<>();
        for (Cipo cipok:cipo) {
            ArrayList<Cipo> c1;
            if(ujlist.containsKey(cipok.getEvszak())){
                c1 = ujlist.get(cipok.getEvszak());
            }
            else{
                c1 = new ArrayList<>();
            }
            c1.add(cipok);
            ujlist.put(cipok.getEvszak(), c1);
        }
        for (Entry<Evszak, ArrayList<Cipo>> entry: ujlist.entrySet()) {
            Evszak key = entry.getKey();
            ArrayList<Cipo> val = entry.getValue();

            System.out.println(key);
            System.out.println(val);
        }
    */
    }
}
