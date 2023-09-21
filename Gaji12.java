import java.util.Scanner;

public class Gaji12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int jumlahMasuk, JumlahTidakMasuk, TotalGaji;
        int gaji=40000, potonganGaji=25000;

        System.out.println("Masukkan Jumlah hari Masuk Kerja Anda ");
        jumlahMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah hari Tidak Masuk Kerja Anda ");
        JumlahTidakMasuk=input.nextInt();

        TotalGaji=(jumlahMasuk * gaji) - (JumlahTidakMasuk * potonganGaji);

        System.out.println("Gaji yang anda terima adalah " + TotalGaji);
    }
}