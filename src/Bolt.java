import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Created by ugyan on 2017.03.07..
 */
public class Bolt {

    private String nev;
    private String cim;
    private String tulajdonos;
    private Vector tejpult;

    public Bolt(String nev, String cim, String tulajdonos, Vector tejpult) {
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

    public Tej vasarolTej(Tej m) {
        tejpult.remove(m);
        return m;
    }

    public void feltoltTej(Tej m) {
        tejpult.add(m);
    }
}
