import java.util.Scanner;

/**
 * Program untuk menghitung keliling dan luas lingkaran
 * Jobsheet 4 - Pemrograman Dasar
 */
public class J04_Lingkaran {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);

        try {
            // Deklarasi variabel
            int r;                // Jari-jari lingkaran
            double keliling;      // Untuk menyimpan hasil perhitungan keliling
            double luas;          // Untuk menyimpan hasil perhitungan luas
            final double PHI = Math.PI;  // Nilai pi yang lebih akurat

            // Input jari-jari dari user
            System.out.println("=== Program Hitung Lingkaran ===");
            System.out.print("Masukkan jari-jari lingkaran: ");
            r = input.nextInt();
            
            // Perhitungan keliling dan luas
            keliling = 2 * PHI * r;
            luas = PHI * r * r;

            // Output hasil perhitungan
            System.out.println("\n=== Hasil Perhitungan ===");
            System.out.println("Jari-jari\t: " + r);
            System.out.printf("Keliling\t: %.2f\n", keliling);
            System.out.printf("Luas\t\t: %.2f\n", luas);
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
        
    }
}