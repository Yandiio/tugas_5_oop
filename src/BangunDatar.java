/**
 * @author Yandi Fenanda
 * @createdOn 22/05/23 Monday
 */
public class BangunDatar {
    int sisi;
    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void printSisi()
    {
        System.out.println(nama + " mempunyai " + sisi +" sisi");
    }

    public double luas() {
        return 0;
    }

    public double keliling() {
        return 0;
    }
}
