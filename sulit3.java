import java.util.Scanner;

public class sulit3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (array[i] != -1) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        if (i != j) {
                            array[j] = -1;
                        }
                    }
                }
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }

        scanner.close();
    }
}