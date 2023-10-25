import java.util.Scanner;

public class LinearSearch11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int elemen = input11.nextInt();

        int[] elemenArray = new int[elemen];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan array ke-" + (i+1) + ":");
            elemenArray[i] = input11.nextInt();
            
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input11.nextInt();

        int hasil = 0; 

        for (int i = 0; i < elemen; i++) {
            if (elemenArray[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != 0) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array");
        }
        
    }
}
