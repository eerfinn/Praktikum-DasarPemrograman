import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        String hasil = printJumlahBilangan(bilangan);
        System.out.println(hasil);
    }

    public static String printJumlahBilangan(int n) {
        if (n == 1) {
            return "1 = 1";
        } else {
            return printJumlahBilangan(n - 1) + " + " + n + (n == 8 ? " = " + jumlahBilangan(n) : "");
        }
    }

    public static int jumlahBilangan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlahBilangan(n - 1);
        }
    }
}
