import java.util.Scanner;

/**
 * Program untuk menghitung nilai akhir dan konversi ke nilai huruf
 * Jobsheet 5 - Pemrograman Dasar
 * Percobaan 2: Penggunaan if-else bertingkat dan operator ternary
 */
public class J05_Pemilihan2 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        try {
            // Deklarasi variabel untuk menyimpan nilai
            float uas, uts, kuis, tugas, total;
            
            // Konstanta bobot penilaian
            final float BOBOT_UAS = 0.4f;
            final float BOBOT_UTS = 0.3f;
            final float BOBOT_KUIS = 0.1f;
            final float BOBOT_TUGAS = 0.2f;
            final float BATAS_REMIDI = 65.0f;

            // Input nilai dari user
            System.out.println("=== Program Hitung Nilai Akhir ===");
            System.out.print("Nilai UAS\t: ");
            uas = input.nextFloat();
            System.out.print("Nilai UTS\t: ");
            uts = input.nextFloat();
            System.out.print("Nilai Kuis\t: ");
            kuis = input.nextFloat();
            System.out.print("Nilai Tugas\t: ");
            tugas = input.nextFloat();

            // Perhitungan nilai total dengan pembobotan
            total = (uas * BOBOT_UAS) + (uts * BOBOT_UTS) + 
                   (kuis * BOBOT_KUIS) + (tugas * BOBOT_TUGAS);
        
            // Menentukan status remidi menggunakan operator ternary
            String statusRemidi = total < BATAS_REMIDI ? "Remidi" : "Tidak Remidi";
            
            // Output nilai total
            System.out.println("\n=== Hasil Penilaian ===");
            System.out.printf("Total Nilai Akhir: %.2f\n", total);
            
            // Menentukan nilai huruf dan kualifikasi
            String nilaiHuruf, nilaiSetara, kualifikasi;
            
            if (total > 80 && total <= 100) {
                nilaiHuruf = "A";
                nilaiSetara = "4.0";
                kualifikasi = "Sangat Baik";
            } else if (total > 73 && total <= 80) {
                nilaiHuruf = "B+";
                nilaiSetara = "3.5";
                kualifikasi = "Lebih dari Baik";
            } else if (total > 65 && total <= 73) {
                nilaiHuruf = "B";
                nilaiSetara = "3.0";
                kualifikasi = "Baik";
            } else if (total > 60 && total <= 65) {
                nilaiHuruf = "C+";
                nilaiSetara = "2.5";
                kualifikasi = "Lebih dari Cukup";
            } else if (total > 50 && total <= 60) {
                nilaiHuruf = "C";
                nilaiSetara = "2.0";
                kualifikasi = "Cukup";
            } else if (total > 39 && total <= 50) {
                nilaiHuruf = "D";
                nilaiSetara = "1.0";
                kualifikasi = "Kurang";
            } else if (total >= 0 && total <= 39) {
                nilaiHuruf = "E";
                nilaiSetara = "0.0";
                kualifikasi = "Gagal";
            } else {
                throw new IllegalArgumentException("Nilai total tidak valid: " + total);
            }
            
            // Output hasil konversi nilai
            System.out.println("\nKonversi Nilai:");
            System.out.println("Nilai Huruf\t: " + nilaiHuruf);
            System.out.println("Nilai Setara\t: " + nilaiSetara);
            System.out.println("Kualifikasi\t: " + kualifikasi);
            System.out.println("Status\t\t: " + statusRemidi);
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    }
}
