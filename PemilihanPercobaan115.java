import java.util.Scanner;

public class PemilihanPercobaan115 {
    public static void main(String[] args) {

        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukan Angka :");
        int angka = input15.nextInt();

        String hasil;
       hasil=(angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
       System.out.println( angka + " adalah " + hasil );

    }
}