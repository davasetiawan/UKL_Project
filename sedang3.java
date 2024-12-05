import java.util.Random;
import java.util.Scanner;

public class sedang3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat datang di Kuis Matematika!");
        System.out.println("Ketik 'stop' untuk keluar.");

        while (true) {

            int bilangan1 = random.nextInt(10) + 1;
            int bilangan2 = random.nextInt(10) + 1;

            char[] operators = { '*', '/', '%' };
            char operator = operators[random.nextInt(operators.length)];

            System.out.print(bilangan1 + " " + operator + " " + bilangan2 + " = ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            int hasil = 0;
            switch (operator) {
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    hasil = bilangan1 / bilangan2;
                    break;
                case '%':
                    hasil = bilangan1 % bilangan2;
                    break;
            }

            try {
                int jawabanUser = Integer.parseInt(input);
                if (jawabanUser == hasil) {
                    System.out.println("Benar! jawabanya adalah " + hasil);
                } else {
                    System.out.println("Salah! Jawaban yang benar adalah " + hasil + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid atau ketik 'stop' untuk keluar.");
            }
        }
    }

}
