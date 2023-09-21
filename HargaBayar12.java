import java.util.Scanner;

public class HargaBayar12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double diskon=0.1, total, bayar, jumlahDiskon;
        
        System.out.println("Masukan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukan jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total= harga * jumlah;
        jumlahDiskon= total * diskon;
        bayar= total - jumlahDiskon;
        
        System.out.println("Diskon yang anda dapatkan " + jumlahDiskon);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}