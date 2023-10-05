import java.util.Scanner;

public class LatihanIndividu215 {
    public static void main(String[] args) {
        String username = "farelvscode";
        String password = "farel999";
        Boolean signIn = false;
        Scanner input15 = new Scanner(System.in);

        while (!signIn) {
            System.out.print("Masukan Username Anda : ");
            String usernameIn = input15.next();
            System.out.print("Masukan Pasword Anda : ");
            String passwordIn = input15.next();

            if (usernameIn.equals(username) && passwordIn.equals(password)) {
                signIn = true;
            } else {
                System.out.println("Ussername atau Password yang anda masukan salah");
            }
        }
        if (signIn = true) {
            System.out.println("Login Berhasil");
            System.out.println("Selamat Datang " + username + "!");
            System.out.println("[System]");
        }
    }
}