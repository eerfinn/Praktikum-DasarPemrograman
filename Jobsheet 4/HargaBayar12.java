import java.util.Scanner;

public class HargaBayar12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merekBuku;
        int harga, jumlah, jumlahHalaman;
        double diskon, total, bayar, jumlahDiskon;
        
        System.out.println("Masukan Merek Buku yang dibeli ");
        merekBuku=input.nextLine();
        System.out.println("Masukan Jumlah halaman buku yang dibeli ");
        jumlahHalaman=input.nextInt();
        System.out.println("Masukan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukan diskon barang yang dibeli ");
        diskon=input.nextDouble();

        total= harga * jumlah;
        jumlahDiskon= total * diskon;
        bayar= total - jumlahDiskon;
        
        System.out.println("Diskon yang anda dapatkan " + jumlahDiskon);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}