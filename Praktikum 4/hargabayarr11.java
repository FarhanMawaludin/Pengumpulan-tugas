import java.util.Scanner;
public class hargabayarr11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double dis = 0.1, total, bayar, jmlDis;
        String merkBuku;
        
        System.out.println("Masukan Harga");
        harga = input.nextInt();
        System.out.println("Jumlah Barang Yang DiBeli");
        jumlah = input.nextInt();
        
        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total - jmlDis;
        System.out.println("DISKON yang Didapat " + jmlDis);
        System.out.println("Jumlah yang Di Bayar " + bayar);
    }
    
}
