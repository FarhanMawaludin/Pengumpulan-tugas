import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input11.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        double rata2;
        int mahasiswaLulus = 0; 
        double totalTdklulus = 0;
        double totalLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input11.nextInt();

            if (nilaiMhs[i] > 70) { 
                totalLulus +=nilaiMhs[i];
                mahasiswaLulus++;
            }else{
                totalTdklulus += nilaiMhs[i];
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = totalLulus / mahasiswaLulus;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai tidak lulus : " +  totalTdklulus / (nilaiMhs.length - mahasiswaLulus));
       
    }
}
