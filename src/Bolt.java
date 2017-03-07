import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by ugyan on 2017.03.07..
 */
public class Bolt {

    private String nev;
    private String cim;
    private String tulajdonos;
    private Hashtable<Long, Tej> tejpult;

    public Bolt(String nev, String cim, String tulajdonos, Hashtable tejpult) {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.tejpult = tejpult;
    }

    public Bolt(String nev, String cim, String tulajdonos) {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
    }

    public String getNev() { return this.nev; }

    public String getCim() { return this.cim; }

    public String getTulajdonos() { return this.tulajdonos; }

    public boolean vanMegTej() {
        if (tejpult.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Tej vasarolTej(long vonalkod) {
        return tejpult.remove(tejpult.get(vonalkod));
    }

    public void feltoltTej(Tej m) {
        tejpult.put(m.getVonalkod(), m);
    }

    class BoltBejegyzes {

        private Tej t;
        private int mennyiseg;
        private int ar;

        public BoltBejegyzes(Tej t, int mennyiseg, int ar) {
            this.t = t;
            this.mennyiseg = mennyiseg;
            this.ar = ar;
        }

        public Tej getT() { return t; }

        public void setT(Tej t) { this.t = t; }

        public int getMennyiseg() { return this.mennyiseg; }

        public void setMennyiseg(int mennyiseg) { this.mennyiseg = mennyiseg; }

        public void adMennyiseg(int mennyiseg) { this.mennyiseg += mennyiseg; }

        public void levonMennyiseg(int mennyiseg) { this.mennyiseg -= mennyiseg; }

        public int getAr() { return this.ar; }

        public void setAr(int ar) { this.ar = ar; }
    }
}
