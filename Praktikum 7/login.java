import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        String username = "user";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        boolean login = false;

        System.out.println("******LOGIN******");

        while (!login) {
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();

            if (inputUsername.equals(username)) {
                System.out.print("Masukkan password: ");
                String inputPassword = scanner.nextLine();

                if (inputPassword.equals(password)) {
                    System.out.println("Login berhasil. Selamat datang, " + inputUsername + "!");
                    login = true;
                } else {
                    System.out.println("Login gagal. Password salah.");
                }
            } else {
                System.out.println("Login gagal. Username tidak ditemukan. Silakan coba lagi.");
                continue; // Meminta pengguna untuk mengisi ulang username
            }
        }

        scanner.close();
    }
}
