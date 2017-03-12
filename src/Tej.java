import java.util.Date;

/**
 * Created by ugyan on 2017.03.07..
 */
public abstract class Tej {

    protected long vonalkod;
    protected int urtartalom;
    protected String gyarto;
    protected Date szavatossag;
    protected double zsirtartalom;
    final int LITER = 4;
    final int FELLITER = 2;
    final int POHAR = 1;
    final double ZSIROS = 2.8;
    final double FELZSIROS = 1.2;

    public Tej(long vonalkod, int urtartalom, String gyarto, Date szavatossag, double zsirtartalom) {
        this.vonalkod = vonalkod;
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatossag = szavatossag;
        this.zsirtartalom = zsirtartalom;
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


    public String toString() {
        return "Űrtartalom: " + urtartalom + "\n" +
                "Gyártó: " + gyarto + "\n" +
                "Szavatosság: " + szavatossag + "\n" +
                "Zsírtartalom " + zsirtartalom;
    }
}
