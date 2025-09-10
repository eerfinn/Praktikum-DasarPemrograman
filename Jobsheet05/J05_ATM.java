import java.util.Scanner;

/**
 * Program simulasi ATM sederhana
 * Jobsheet 5 - Pemrograman Dasar
 * Fitur: Login, Cek Saldo, Tarik Tunai, Setor Tunai
 */
public class J05_ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
        
        // Inisialisasi data akun
        final int SALDO_AWAL = 800000000;  // Saldo awal rekening
        final String ID_VALID = "Ekal";    // ID untuk login
        final int PIN_VALID = 332005;      // PIN untuk login
        
        // Variabel untuk menyimpan data transaksi
        int saldo = SALDO_AWAL;
        int uang = 500000;    // Uang tunai yang dimiliki nasabah
        System.out.println("---------------------------------");
        System.out.println("  SELAMAT DATANG DI BANK JALI !");
        System.out.println("---------------------------------");
        // Proses login
        System.out.print("Masukkan ID Anda : ");
        String inputId = scan.next();
        System.out.print("\nMasukkan PIN Anda : ");
        int inputPin = scan.nextInt();
        
        // Verifikasi ID dan PIN
        if (inputId.equals(ID_VALID) && inputPin == PIN_VALID) {
            // Tampilkan pesan sukses dan menu
            System.out.println("\n\t\tLogin Berhasil !");
            System.out.println("\n||==================||");
            System.out.println("||   PILIHAN MENU   ||");
            System.out.println("||__________________||");
            System.out.println("||  1. Cek Saldo    ||");
            System.out.println("||  2. Tarik Tunai  ||");
            System.out.println("||  3. Setor Tunai  ||");
            System.out.println("||  4. Keluar       ||");
            System.out.println("||==================||");
            System.out.print("\nPilih menu (1-4): ");
            int pilihan = scan.nextInt();
            // Proses menu yang dipilih
            switch (pilihan) {
                case 1: // Cek Saldo
                    System.out.println("\n=== Informasi Saldo ===");
                    System.out.printf("Saldo Rekening\t: Rp %,d\n", saldo);
                    System.out.printf("Uang Tunai\t: Rp %,d\n", uang);
                    break;
                    
                case 2: // Tarik Tunai
                    System.out.println("\n=== Tarik Tunai ===");
                    System.out.print("Masukkan jumlah penarikan (kelipatan 50000)\nRp ");
                    int tarik = scan.nextInt();
                    
                    // Validasi jumlah penarikan
                    if (tarik > saldo - 49999) {
                        System.out.println("\nGAGAL: Saldo Anda tidak mencukupi!");
                    } else if (tarik % 50000 != 0) {
                        System.out.println("\nGAGAL: Penarikan tunai harus kelipatan Rp50.000!");
                    } else {
                        // Proses penarikan
                        saldo -= tarik;
                        uang += tarik;
                        System.out.println("\nPenarikan Tunai Berhasil!");
                        System.out.printf("Jumlah penarikan\t: Rp %,d\n", tarik);
                        System.out.printf("Sisa saldo\t\t: Rp %,d\n", saldo);
                        System.out.printf("Uang tunai sekarang\t: Rp %,d\n", uang);
                    }
                    break;
                    
                case 3: // Setor Tunai
                    System.out.println("\n=== Setor Tunai ===");
                    System.out.print("Masukkan jumlah setoran (kelipatan 50000)\nRp ");
                    int setor = scan.nextInt();
                    
                    // Validasi jumlah setoran
                    if (setor > uang) {
                        System.out.println("\nGAGAL: Uang tunai Anda tidak mencukupi!");
                    } else if (setor % 50000 != 0) {
                        System.out.println("\nGAGAL: Setoran tunai harus kelipatan Rp50.000!");
                    } else {
                        // Proses setoran
                        saldo += setor;
                        uang -= setor;
                        System.out.println("\nSetoran Tunai Berhasil!");
                        System.out.printf("Jumlah setoran\t\t: Rp %,d\n", setor);
                        System.out.printf("Saldo sekarang\t\t: Rp %,d\n", saldo);
                        System.out.printf("Sisa uang tunai\t\t: Rp %,d\n", uang);
                    }
                    break;
                    
                case 4: // Keluar
                    System.out.println("\nTerima kasih telah menggunakan ATM Bank Jali!");
                    break;
                    
                default: // Menu tidak valid
                    System.out.println("\nGAGAL: Menu tidak valid! Pilih menu 1-4.");
            }
        } else {
            System.out.println("\nLogin Gagal! ID atau PIN tidak valid.");
        }
        } finally {
            // Menutup scanner untuk mencegah resource leak
            scan.close();
        }
    }
}