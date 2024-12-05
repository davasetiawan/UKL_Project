
public class sedang2 {

    static void hitungvolume(double r, double t) {

        double volume = Math.PI * r * r * t;
        System.out.println(volume);
    }

    static void hasil(String a) {
        System.out.println(a);
    }

    static int persegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        hasil("ini volume tabungnya");
        hitungvolume(7, 10);
        System.out.println(persegi(12));

    }

}
