import java.util.Scanner;

public class PemilihanPercobaan212 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Masukan nilai UTS    :");
        float uts = input12.nextInt();
        System.out.print("Masukan nilai UAS    :");
        float uas = input12.nextInt();
        System.out.print("Masukan nilai Kuis   :");
        float kuis = input12.nextInt();
        System.out.print("Masukan nilai tugas  :");
        float tugas = input12.nextInt();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total <65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir " + total + " Sehingga " + message);
    }    
}
