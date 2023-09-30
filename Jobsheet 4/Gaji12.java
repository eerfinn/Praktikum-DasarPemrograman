import java.util.Scanner;

public class Gaji12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int jumlahMasuk, JumlahTidakMasuk, TotalGaji;
        int gaji, potonganGaji;

        System.out.println("Masukkan Jumlah hari Masuk Kerja Anda ");
        jumlahMasuk=input.nextInt();
        System.out.println("Masukan Besaran Gaji ");
        gaji=input.nextInt();
        System.out.println("Masukkan Jumlah hari Tidak Masuk Kerja Anda ");
        JumlahTidakMasuk=input.nextInt();
        System.out.println("Masukan Potongan Gaji ");
        potonganGaji=input.nextInt();

        TotalGaji=(jumlahMasuk * gaji) - (JumlahTidakMasuk * potonganGaji);

        System.out.println("Gaji yang anda terima adalah " + TotalGaji);
    }
}