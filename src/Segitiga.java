/**
 * @author Yandi Fenanda
 * @createdOn 22/05/23 Monday
 */
public class Segitiga extends BangunDatar {
    private int alas, tinggi;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }
}
