import java.util.Scanner;

/**
 * Program untuk menghitung harga bayar buku dengan diskon
 * Jobsheet 4 - Pemrograman Dasar
 */
public class J04_HargaBayar {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);

        try {
            // Deklarasi variabel
            String merekBuku;     // Menyimpan merek/judul buku
            int harga;           // Harga per buku
            int jumlah;         // Jumlah buku yang dibeli
            double diskon;      // Persentase diskon dalam desimal (misal: 0.1 untuk 10%)
            double total;       // Total harga sebelum diskon
            double bayar;       // Total yang harus dibayar setelah diskon
            double jumlahDiskon; // Nilai rupiah dari diskon
            
            // Input data dari user
            System.out.println("=== Program Hitung Pembayaran Buku ===");
            System.out.print("Masukkan Merek/Judul Buku: ");
            merekBuku = input.nextLine();
            System.out.print("Masukkan Harga Buku: Rp ");
            harga = input.nextInt();
            System.out.print("Masukkan Jumlah Buku: ");
            jumlah = input.nextInt();
            System.out.print("Masukkan Diskon (dalam desimal, misal 0.1 untuk 10%): ");
            diskon = input.nextDouble();

            // Perhitungan
            total = harga * jumlah;
            jumlahDiskon = total * diskon;
            bayar = total - jumlahDiskon;
            
            // Output hasil perhitungan
            System.out.println("\n=== Rincian Pembayaran ===");
            System.out.println("Judul Buku\t\t: " + merekBuku);
            System.out.println("Harga Satuan\t\t: Rp " + harga);
            System.out.println("Jumlah Beli\t\t: " + jumlah);
            System.out.println("Total Harga\t\t: Rp " + total);
            System.out.println("Diskon (" + (diskon*100) + "%)\t: Rp " + jumlahDiskon);
            System.out.println("--------------------------------");
            System.out.println("Total Pembayaran\t: Rp " + bayar);
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    }
}