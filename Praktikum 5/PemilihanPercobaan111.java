import java.util.Scanner;

public class PemilihanPercobaan111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        

        System.out.println("Masukan Angka");
        int angka = input11.nextInt();

        String hasil = (angka % 2 == 0) ? "angka"+angka+"bilangan genap" : "angka"+angka+"bilangan ganjil";
        System.out.println(hasil);
        



    }
}