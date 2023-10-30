import java.util.Scanner;
public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
         int baris, kolom;
         String nama, next;
         
         String[][] penonton = new String [4][2];
         
         while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = input11.nextInt();

            if (menu == 1) {
                System.out.print("Masukan Nama: ");
                nama = input11.next();
                boolean kursiTersedia = true;

                while (kursiTersedia){
                    System.out.print("Masukan Baris: ");
                    baris = input11.nextInt();
                    System.out.print("Masukan Kolom: ");
                    kolom = input11.nextInt();
                    input11.nextLine();

                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Kursi berhasil diisi.");
                            kursiTersedia = false;
                        } else {
                            System.out.println("kursi ini sudah terisi. Silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("nomor baris atau kolom kursi tidak tersedia.");
                    }
                } 

            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                        }else{
                            System.out.printf("Baris %d, Kolom %d: ***\n", i + 1, j + 1, penonton[i][j]);
                        }
                    }
                }
        }else if (menu==3){
            System.out.println("Program berakhir");
            break;
        }else {
            System.out.println("Input tidak valid!!!");
        }
            

            System.out.print("Input penonton lainnya (y/n): ");
            next = input11.next();

            if (next.equals("n")) {
                break;
            }

         }
    }
}
