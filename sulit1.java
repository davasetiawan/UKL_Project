import java.util.Scanner;

public class sulit1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] nilai = new int[jumlahSiswa];
        int totalNilai = 0;

        int i = 0;
        do {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            int input = scanner.nextInt();

            if (input < 0 || input > 100) {
                System.out
                        .println("Maaf, nilaiyang anda input tidak masuk kriteria");
            } else {
                nilai[i] = input;
                totalNilai += input;
                i++;
            }
        } while (i < jumlahSiswa);

        double rataRata = (double) totalNilai / jumlahSiswa;
        System.out.println("Nilai rata-rata adalah: " + rataRata);

        scanner.close();
    }
}