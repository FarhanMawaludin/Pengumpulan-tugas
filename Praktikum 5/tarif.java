import java.util.Scanner;
public class tarif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int beratBarang, jarak;
        double tarifDasar = 10000, tarifDsasrKg = 1000, tarifDasarKm = 2000, biayaBerat, biayaJarak, biayaTotal;

        System.out.println("MASUKAN BERAT BARANG : ");
        beratBarang = input.nextInt();
        System.out.println("MASUKAN JARAK PENGIRIMAN : ");
        jarak = input.nextInt();

        if(beratBarang <= 5){
            biayaBerat = 0;
        }else{
            biayaBerat = (beratBarang-5)*tarifDasar;
        }
        if(jarak <= 1000){
            biayaJarak = 0;
        }else{
            biayaJarak = (jarak-100)*tarifDasarKm;
        }
        biayaTotal = tarifDasar+biayaBerat+biayaJarak;
        System.out.println("Biaya Pengiriman : " + biayaTotal);
    }
}