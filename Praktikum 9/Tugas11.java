import java.util.Scanner;

public class Tugas11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        // Input banyaknya elemen
        System.out.print("Masukan banyaknya elemen : ");
        int elemen = input11.nextInt();

        // Input nilai elemen
        int[] nilaiElemen = new int[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai elemen ke-" + (i + 1) + " : ");
            nilaiElemen[i] = input11.nextInt();
        }

        // Mencari nilai tertinggi, terendah, dan rata-rata
        int nilaiTertinggi = nilaiElemen[0];
        int nilaiTerendah = nilaiElemen[0];
        int totalNilai = 0;

        for (int i = 0; i < elemen; i++) {
            if (nilaiElemen[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiElemen[i];
            }

            if (nilaiElemen[i] < nilaiTerendah) {
                nilaiTerendah = nilaiElemen[i];
            }

            totalNilai += nilaiElemen[i];
        }

        double nilaiRataRata = (double) totalNilai / elemen;

        // Output
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Nilai rata-rata : " + nilaiRataRata);
    }
}