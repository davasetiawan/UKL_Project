import java.util.Scanner;

public class mudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarmin = 10;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int volume = 100;

        System.out.println("MAsukan berat paket");
        int abot = input.nextInt();

        System.out.println("MAsukan jarak tempuh");
        int jartem = input.nextInt();

        System.out.println("MAsukan tinggi barang");
        int t = input.nextInt();

        System.out.println("MAsukan lebar barang");
        int l = input.nextInt();

        System.out.println("MAsukan panjang barang");
        int p = input.nextInt();

        int hivolume = p * l * t;

        if (jartem <= jarmin) {
            int result1 = harga1 * abot;
            {
                if (hivolume > volume) {
                    int fresult = result1 + harga3;
                    System.out.println("harga yang harus dibayar = Rp." + fresult);
                } else {
                    System.out.println("harga yang harus dibayar = Rp." + result1);
                }
            }
        } else if (jartem >= jarmin) {
            int reuslt2 = harga2 * abot;
            if (hivolume > volume) {
                int fresult = reuslt2 + harga3;
                System.out.println("harga yang harus dibayar = Rp." + fresult);
            } else {
                System.out.println("harga yang harus dibayar = Rp." + reuslt2);
            }

        }

    }
}
