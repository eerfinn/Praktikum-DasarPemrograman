import java.util.Scanner;

public class PemilihanPercobaan12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
         
        System.out.print("Masukan angka: ");
        int angka = input12.nextInt();
        
        if (angka % 2 == 0)
            System.out.println("Angka " + angka + " Adalah Bilanga Genap");

        else
            System.out.println("Angka " + angka + "Adalah Bilangan Ganjil");
    }
}