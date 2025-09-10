import java.util.Scanner;

/**
 * Program untuk menghitung gaji karyawan berdasarkan kehadiran
 * Jobsheet 4 - Pemrograman Dasar
 */
public class J04_Gaji {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);

        try {
            // Deklarasi variabel
            int jumlahMasuk;      // Menyimpan jumlah hari masuk kerja
            int jumlahTidakMasuk; // Menyimpan jumlah hari tidak masuk
            int totalGaji;        // Menyimpan hasil perhitungan total gaji
            int gaji;             // Menyimpan besaran gaji per hari
            int potonganGaji;     // Menyimpan besaran potongan per hari

            // Input data dari user
            System.out.println("Masukkan Jumlah hari Masuk Kerja Anda: ");
            jumlahMasuk = input.nextInt();
            System.out.println("Masukkan Besaran Gaji per Hari: ");
            gaji = input.nextInt();
            System.out.println("Masukkan Jumlah hari Tidak Masuk Kerja Anda: ");
            jumlahTidakMasuk = input.nextInt();
            System.out.println("Masukkan Potongan Gaji per Hari: ");
            potonganGaji = input.nextInt();

            // Perhitungan total gaji
            // Total = (hari masuk × gaji per hari) - (hari tidak masuk × potongan per hari)
            totalGaji = (jumlahMasuk * gaji) - (jumlahTidakMasuk * potonganGaji);

            // Output hasil perhitungan
            System.out.println("\nRincian Perhitungan Gaji:");
            System.out.println("Gaji per hari\t\t: " + gaji);
            System.out.println("Potongan per hari\t: " + potonganGaji);
            System.out.println("Total hari masuk\t\t: " + jumlahMasuk);
            System.out.println("Total hari tidak masuk\t: " + jumlahTidakMasuk);
            System.out.println("--------------------------------");
            System.out.println("Total gaji yang diterima: " + totalGaji);
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    }
}