import java.util.Scanner;

/**
 * Program untuk menghitung penjumlahan deret bilangan menggunakan rekursi
 * Jobsheet 14 - Pemrograman Dasar
 * Konsep: Rekursi untuk menjumlahkan deret dan membuat string representasi
 */
public class J14_PenjumlahanRekursif {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        try {
            // Input bilangan dari user
            System.out.println("=== Program Penjumlahan Deret (Rekursif) ===");
            System.out.print("Masukkan bilangan (n > 0): ");
            int bilangan = input.nextInt();

            // Validasi input
            if (bilangan <= 0) {
                System.out.println("Error: Bilangan harus lebih besar dari 0!");
                return;
            }

            // Menghitung dan menampilkan hasil
            System.out.println("\nHasil Penjumlahan Deret:");
            String hasil = printJumlahBilangan(bilangan);
            // Hitung jumlah deret
            int jumlah = jumlahBilangan(bilangan);
            
            // Tampilkan hasil lengkap
            System.out.println(hasil + " = " + jumlah);
            System.out.println("\nPenjelasan:");
            System.out.println("- Deret bilangan dari 1 sampai " + bilangan);
            System.out.println("- Total penjumlahan: " + jumlah);
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    }

    /**
     * Fungsi rekursif untuk membuat string representasi penjumlahan deret
     * Contoh: untuk n=4 akan menghasilkan "1 + 2 + 3 + 4 = 10"
     * 
     * @param n bilangan terakhir dalam deret
     * @return string representasi penjumlahan deret
     */
    public static String printJumlahBilangan(int n) {
        // Basis: ketika n = 1, hanya tampilkan "1"
        if (n == 1) {
            return "1";
        } 
        // Rekursi: gabungkan hasil sebelumnya dengan bilangan sekarang
        else {
            return printJumlahBilangan(n - 1) + " + " + n;
        }
    }

    /**
     * Fungsi rekursif untuk menghitung jumlah deret bilangan
     * Contoh: untuk n=4 akan menghitung 1+2+3+4=10
     * 
     * @param n bilangan terakhir dalam deret
     * @return hasil penjumlahan deret dari 1 sampai n
     */
    public static int jumlahBilangan(int n) {
        // Basis: ketika n = 1, kembalikan 1
        if (n == 1) {
            return 1;
        } 
        // Rekursi: jumlahkan n dengan hasil penjumlahan n-1
        else {
            return n + jumlahBilangan(n - 1);
        }
    }
}
