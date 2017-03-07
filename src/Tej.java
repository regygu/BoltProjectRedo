import java.util.Date;

/**
 * Created by ugyan on 2017.03.07..
 */
public class Tej {

    private int urtartalom;
    private String gyarto;
    private Date szavatossag;
    private double zsirtartalom;
    private long ar;

    public Tej(int urtartalom, String gyarto, Date szavatossag, double zsirtartalom, long ar) {
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatossag = szavatossag;
        this.zsirtartalom = zsirtartalom;
        this.ar = ar;
    }

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
