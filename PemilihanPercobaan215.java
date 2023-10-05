import java.util.Scanner;

public class PemilihanPercobaan215 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Nilai : ");
        float uas = input15.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input15.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input15.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input15.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        if ( total > 80 && total >= 100) {
            System.out.print("Nilai anda adalah : A");
        } else if (total > 73 && total >= 80) {
            System.out.print("Nilai anda adalah : B+");
        } else if (total > 65 && total >= 73) {
            System.out.print("Nilai anda adalah : B");
        } else if (total > 60 && total >= 65) {
            System.out.print("Nilai anda adalah : C+");
        } else if (total > 50 && total >= 60) {
            System.out.print("Nilai anda adalah : C");
        } else if (total > 39 && total >= 50) {
            System.out.print("Nilai anda adalah : D");
        } else {
            System.out.print("Nilai anda adalah : E");
        }
    }
}