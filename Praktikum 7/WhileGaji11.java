import java.util.Scanner;
public class WhileGaji11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur =0,totalGajiLembur=0;

        System.out.print("Masukan Jumlah Karyawan : ");
        jumlahKaryawan = scan.nextInt();

        int i=0;
        String jabatan;
        while (i <jumlahKaryawan) {
            System.out.print("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.print("Masukan jabatan karyawan ke-" + (i+1) + " = ");
            jabatan = scan.next();
            System.out.print("Masukan jumlah jam lembur : ");
            jumlahJamLembur = scan.nextInt();
            i++;  
            

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }
            else if (jabatan.equalsIgnoreCase("manager")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }else {
                System.out.println("jabatan tidak valid");
                i--;
                
            }
            totalGajiLembur += gajiLembur;
           
        }
         
         System.out.println("Total Gaji Lembur : " + totalGajiLembur);
         

    }
    
}
