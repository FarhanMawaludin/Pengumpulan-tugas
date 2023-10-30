import java.util.Scanner;
public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
         int baris, kolom;
         String nama, next;

         String[][] penonton = new String [4][2];

         while (true) {
            System.out.print("Masukkan Nama : ");
            nama = input11.next();
            System.out.print("Masukakn Baris : ");
            baris = input11.nextInt();
            System.out.print("Masukan Kolom : ");
            kolom = input11.nextInt();
            input11.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya (y/n): ");
            next = input11.next();

            if (next.equals("n")) {
                break;
            }

         }
    }
}
