import java.util.Date;

/**
 * Created by ugyan on 2017.03.07..
 */
public class Tej {

    private long vonalkod;
    private int urtartalom;
    private String gyarto;
    private Date szavatossag;
    private double zsirtartalom;
    private long ar;
    final int LITER = 4;
    final int FELLITER = 2;
    final int POHAR = 1;
    final double ZSIROS = 2.8;
    final double FELZSIROS = 1.2;

    public Tej(long vonalkod, int urtartalom, String gyarto, Date szavatossag, double zsirtartalom, long ar) {
        this.vonalkod = vonalkod;
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatossag = szavatossag;
        this.zsirtartalom = zsirtartalom;
        this.ar = ar;
    }

    public long getVonalkod() { return this.vonalkod; }

    public boolean joMeg() {
        if (this.szavatossag.after(new Date())) {
            return true;
        } else {
            return false;
        }
    }

    public int getUrtartalom() {
        return this.urtartalom;
    }

    public String getGyarto() {
        return this.gyarto;
    }

    public Date getSzavatossag() {
        return this.szavatossag;
    }

    public double getZsirtartalom() {
        return this.zsirtartalom;
    }

    public long getAr() {
        return this.ar;
    }

    public String toString() {
        return "Űrtartalom: " + urtartalom + "\n" +
                "Gyártó: " + gyarto + "\n" +
                "Szavatosság: " + szavatossag + "\n" +
                "Zsírtartalom " + zsirtartalom + "\n" +
                "Ár " + ar;
    }
}
