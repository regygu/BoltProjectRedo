import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ugyan on 2017.03.07..
 */
public class Bolt {

    private String nev;
    private String cim;
    private String tulajdonos;
    private Tej[] tejpult;
    private int flag;


    public Bolt(String nev, String cim, String tulajdonos, Tej[] tejpult) {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.tejpult = tejpult;
    }

    public String getNev() { return this.nev; }

    public String getCim() { return this.cim; }

    public String getTulajdonos() { return this.tulajdonos; }

    public boolean vanMegTej() {
        if (tejpult.length == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Tej vasarolTej(Tej m) {
        List<Tej> tejList = new ArrayList<Tej>(Arrays.asList(tejpult));
        tejList.remove(m);
        this.tejpult = tejList.toArray(tejpult);
        return m;
    }


}