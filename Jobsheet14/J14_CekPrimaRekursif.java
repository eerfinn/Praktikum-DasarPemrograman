import java.util.Scanner;

/**
 * Program untuk mengecek bilangan prima menggunakan rekursi
 * Jobsheet 14 - Pemrograman Dasar
 * Konsep: Rekursi untuk mengecek pembagi dari suatu bilangan
 */
public class J14_CekPrimaRekursif {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);
        
        try {
            // Input bilangan dari user
            System.out.println("=== Program Cek Bilangan Prima (Rekursif) ===");
            System.out.print("Masukkan bilangan: ");
            int bilangan = input.nextInt();

            // Validasi input
            if (bilangan < 0) {
                System.out.println("Error: Bilangan tidak boleh negatif!");
                return;
            }

            // Cek apakah bilangan prima menggunakan fungsi rekursif
            if (cekPrimaRekursif(bilangan, 2)) {
                System.out.println("\nHasil: " + bilangan + " adalah bilangan prima");
                System.out.println("Penjelasan: " + bilangan + " hanya bisa dibagi oleh 1 dan " + bilangan);
            } else {
                System.out.println("\nHasil: " + bilangan + " bukan bilangan prima");
                System.out.println("Penjelasan: " + bilangan + " bisa dibagi oleh bilangan lain selain 1 dan dirinya sendiri");
            }
        } finally {
            // Menutup scanner untuk mencegah resource leak
            input.close();
        }
    }

    /**
     * Fungsi rekursif untuk mengecek apakah suatu bilangan adalah prima
     * 
     * @param n bilangan yang akan dicek
     * @param pembagi pembagi yang dicek (dimulai dari 2)
     * @return true jika bilangan adalah prima, false jika bukan
     */
    public static boolean cekPrimaRekursif(int n, int pembagi) {
        // Basis 1: Bilangan kurang dari atau sama dengan 1 bukan prima
        if (n <= 1) {
            return false;
        } 
        // Basis 2: Jika pembagi sudah mencapai n, berarti tidak ada pembagi lain
        else if (pembagi == n) {
            return true;
        }
        // Rekursi: Cek apakah n habis dibagi pembagi
        else {
            // Jika n habis dibagi pembagi, maka bukan prima
            if (n % pembagi == 0) {
                return false;
            } 
            // Jika tidak habis dibagi, lanjut ke pembagi berikutnya
            else {
                return cekPrimaRekursif(n, pembagi + 1);
            }
        }
    }
}
