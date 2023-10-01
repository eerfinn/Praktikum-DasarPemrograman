import java.util.Scanner;

public class PemilihanPercobaan212 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        float uas, uts, kuis, tugas, total;

        System.out.print("Nilai UAS        : ");
        uas = input12.nextFloat();
        System.out.print("Nilai UTS        : ");
        uts = input12.nextFloat();
        System.out.print("Nilai Kuis       : ");
        kuis = input12.nextFloat();
        System.out.print("Nilai Tugas      : ");
        tugas = input12.nextFloat();

        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        String message = total <65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Total Nilai Akhir: " + total);
        System.out.println("");

        if (total > 80 && total <= 100) {
            System.out.println("Nilai Huruf  : A");
            System.out.println("Nilai Setara : 4");
            System.out.println("Kualifikasi Sangat Baik" + " Sehingga " + message);
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai huruf  : B+");
            System.out.println("Nilai setara : 3,5");
            System.out.println("Kualifikasi Lebih Dari Baik" + " Sehingga " + message);
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai huruf  : B");
            System.out.println("Nilai setara : 3");
            System.out.println("Kualifikasi Baik" + " Sehingga " + message);
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai huruf  : C+");
            System.out.println("Nilai setara : 2,5");
            System.out.println("Kualifikasi Lebih Dari Cukup" + " Sehingga " + message);
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai huruf  : C");
            System.out.println("Nilai setara : 2");
            System.out.println("Kualifikasi Cukup" + " Sehingga " + message);
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai huruf  : D");
            System.out.println("Nilai setara : 1");
            System.out.println("Kualifikasi Kurang" + " Sehingga " + message);
        } else if (total >= 0 && total <= 39) {
            System.out.println("Nilai huruf  : E");
            System.out.println("Nilai setara : 1");
            System.out.println("Kualifikasi Gagal" + " Sehingga " + message);
        } else {
            System.out.println("Terjadi kesalahan");
        }
    }
}
