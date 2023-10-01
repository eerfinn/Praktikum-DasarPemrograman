import java.util.Scanner;

public class PemilihanPercobaan12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
         
        String hasil;

        System.out.print("Masukan angka: ");
        int angka = input12.nextInt();
        
        if (angka % 2 == 0) {
            hasil = "Bilangan Genap";
        }
        else{
            hasil = "Bilangan Ganjil";
        }
        System.out.println(angka + " adalah " + hasil);
    }
}