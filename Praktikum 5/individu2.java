import java.util.Scanner;
public class individu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usernamebenar = "parahan";
        String passwordbenar = "0052230513";
        String username;
        String password;

        System.out.print("Masukan Username : ");
        username = input.nextLine();
        System.out.print("Masukan Password : ");
        password = input.nextLine();

        if(username.equals(usernamebenar) && password.equals(passwordbenar)) {
            System.out.println("Berhasil Login");
        }
        else{
            System.out.println("Login Gagal");
        }

    }
}
