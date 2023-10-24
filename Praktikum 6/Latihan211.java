import java.util.Scanner;

public class Latihan211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jenis buku : ");
        String buku = sc.nextLine();

        System.out.print("Jumlah Buku : ");
        int jumlah = sc.nextInt();

        System.out.print("Masukan Harga per Buku : ");
        double harga = sc.nextDouble();

        double diskon = 0.0, subTotal, totalHarga;
        subTotal = harga * jumlah;

        if(buku.equals("kamus")) {
            if (jumlah > 2) {
                diskon = subTotal * 0.12; // 10%+2%
            }else {
                diskon = subTotal * 0.10; // yang biasa
            }
        }else if(buku.equals("novel")){
            if(jumlah > 3) {
                diskon = subTotal * 0.09;// 7%+2%
            }else {
                diskon = subTotal * 0.08;//7%+1%
            }
        }else {
            if(jumlah > 3) {
                diskon = subTotal * 0.05; // ketika membeli selain kamus dan novel
            }
        }

        totalHarga = subTotal - diskon;
        System.out.println("Harga Awal : " + subTotal);
        System.out.println("Total Diskon : " + diskon);
        System.out.println("Total Harga : " + totalHarga);
    }
    
} 