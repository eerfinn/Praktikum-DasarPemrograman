import java.util.Scanner;

/**
 * Program untuk menentukan bilangan ganjil atau genap
 * Jobsheet 5 - Pemrograman Dasar
 * Percobaan 1: Penggunaan if-else sederhana
 */
public class J05_Pemilihan1 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        try {
            // Deklarasi variabel untuk menyimpan hasil
            String hasil;
            
            // Input angka dari user
            System.out.println("=== Program Cek Bilangan Ganjil Genap ===");
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();

            // Pengecekan ganjil atau genap menggunakan modulo
            if (angka % 2 == 0) {
                hasil = "Bilangan Genap";
            } else {
                hasil = "Bilangan Ganjil";
            }

            // Menampilkan hasil
            System.out.println("\nHasil Pengecekan:");
            System.out.println("Angka " + angka + " adalah " + hasil);
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    }
}