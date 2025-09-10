import java.util.Scanner;

/**
 * Program kalkulator sederhana dengan switch case
 * Jobsheet 5 - Pemrograman Dasar
 * Percobaan 3: Penggunaan switch case untuk operasi matematika
 */
public class J05_Pemilihan3 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        try {
            // Deklarasi variabel
            double angka1, angka2, hasil;
            char operator;

            // Input data dari user
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.print("Masukkan angka pertama : ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua   : ");
            angka2 = input.nextDouble();
            System.out.print("Pilih operator (+ - * /): ");
            operator = input.next().charAt(0);

            // Proses perhitungan berdasarkan operator
            System.out.println("\n=== Hasil Perhitungan ===");
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.printf("%.2f + %.2f = %.2f\n", angka1, angka2, hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.printf("%.2f - %.2f = %.2f\n", angka1, angka2, hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.printf("%.2f * %.2f = %.2f\n", angka1, angka2, hasil);
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.printf("%.2f / %.2f = %.2f\n", angka1, angka2, hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    }
                    break;
                default:
                    System.out.println("Error: Operator tidak valid! Gunakan +, -, *, atau /");
            }
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    } 
}
