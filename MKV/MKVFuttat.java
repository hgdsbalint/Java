package MKV;

public class MKVFuttat {
    public static void main(String[] args) {
        MKV vallalat = new MKV();
        vallalat.mesehosok.add(new Ogre("Shrek", true, 200.45, 7, true));
        vallalat.mesehosok.add(new Mesehos("Szamár", true, 250.55, 4));
    }
}
