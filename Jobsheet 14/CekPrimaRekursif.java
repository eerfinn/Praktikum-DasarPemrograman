import java.util.Scanner;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        if (cekPrimaRekursif(bilangan, 2)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }

    public static boolean cekPrimaRekursif(int n, int pembagi) {
        if (n <= 1) {
            return false;
        } else if (pembagi < n) {
            if (n % pembagi == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, pembagi + 1);
            }
        } else {
            return true;
        }
    }
}
