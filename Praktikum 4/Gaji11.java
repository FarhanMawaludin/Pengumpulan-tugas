import java.util.Scanner;
public class Gaji11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmldkMasuk, totGaji, gaji, potGaji;

        System.out.println("Masukan Gaji Anda");
        gaji = input.nextInt();
        System.out.println("Masukan Potongan Gaji");
        potGaji = input.nextInt();
        System.out.println("Jumlah Masuk : ");
        jmlMasuk = input.nextInt();
        System.out.println("Jumlah Tidak Masuk");
        jmldkMasuk = input.nextInt();

        totGaji = ( jmlMasuk*gaji) - (jmldkMasuk*potGaji);
        System.out.println("Total Gaji : " + totGaji);
    }
}