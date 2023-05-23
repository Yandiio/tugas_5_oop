/**
 * @author Yandi Fenanda
 * @createdOn 22/05/23 Monday
 */
public class Lingkaran extends BangunDatar {

    double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * this.jariJari * this.jariJari;
    }
}
