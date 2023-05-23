/**
 * @author Yandi Fenanda
 * @createdOn 22/05/23 Monday
 */
class Main {

    public static void main(String args[]) {

        /*
         * A. Menghitung Luas lingkaran
         *    Menggunakan Diameter dan jari-jari.
         *
         * */
        LuasJariJari luasJariJari = new LuasJariJari(10);
        System.out.println("Luas lingkaran dengan jari-jari: " + luasJariJari.luas());

        LuasDiameter luasDiameter = new LuasDiameter(10);
        System.out.println("Luas lingkaran dengan diameter: " + luasDiameter.luas());

        /*
        * B. Menghitung Luas Persegi Panjang, Segitiga dan Lingkaran
        *    Menggunakan Polimorfisme, Pewarisan dan Overriding.
        *
        * */
        Segitiga segitiga = new Segitiga();
        segitiga.setNama("Segitiga");
        segitiga.setAlas(10);
        segitiga.setTinggi(25);
        segitiga.setSisi(3);

        segitiga.printSisi();
        System.out.println("Luas Segitiga: " + segitiga.luas());

        Persegi persegi = new Persegi();
        persegi.setNama("Persegi");
        persegi.setPanjang(10);
        persegi.setLebar(25);
        persegi.setSisi(4);

        persegi.printSisi();
        System.out.println("Luas Persegi: " + persegi.luas());

        Lingkaran lingkaran = new Lingkaran(10);
        lingkaran.setNama("Lingkaran");
        lingkaran.setSisi(1);

        lingkaran.printSisi();
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
    }
}

