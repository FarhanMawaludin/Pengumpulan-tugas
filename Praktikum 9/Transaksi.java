 import java.util.Scanner;

public class Transaksi {
    public static void main(String[] args) {
        // Inisialisasi
        Scanner input = new Scanner(System.in);
        int jumlahBarang;
        double tarifDasar = 10000, tarifDasarKg = 1000, tarifDasarKm = 2000;
        double biayaAkhir = 0;

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = input.nextInt();

        int[] beratBarangArray = new int[jumlahBarang];
        int[] jarakArray = new int[jumlahBarang];

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("Masukkan berat barang ke-" + (i + 1) + ": ");
            beratBarangArray[i] = input.nextInt();
            System.out.print("Masukkan jarak pengiriman barang ke-" + (i + 1) + ": ");
            jarakArray[i] = input.nextInt();
        }

        for (int i = 0; i < jumlahBarang; i++) {
            int beratBarang = beratBarangArray[i];
            int jarak = jarakArray[i];
            double biayaBerat, biayaJarak, biayaTotal;

            // Menentukan harga berdasarkan data yang telah diinputkan
            if (beratBarang <= 5) {
                biayaBerat = 0;
            } else {
                biayaBerat = (beratBarang - 5) * tarifDasarKg;
            }
            if (jarak <= 100) {
                biayaJarak = 0;
            } else {
                biayaJarak = (jarak - 100) * tarifDasarKm;
            }
            biayaTotal = tarifDasar + biayaBerat + biayaJarak;
            biayaAkhir += biayaTotal;
        }

        System.out.println("Estimasi biaya pengiriman: " + biayaAkhir);
    }
}
 
