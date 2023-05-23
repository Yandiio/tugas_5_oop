/**
 * @author Yandi Fenanda
 * @createdOn 22/05/23 Monday
 */
public class Persegi extends BangunDatar{
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    private int panjang, lebar;
    @Override
    public double luas() {
        return panjang * lebar;
    }
}
