import java.util.Scanner;

public class Whilekelipatan11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0, total = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;   
            }
            i++;
        }

        double rataRata = total / counter;

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d \n", kelipatan, counter);
        System.out.printf("Jumlah semua bilangan kelipatan %d dari 1 sampai 50 adalah %d \n", kelipatan, total);
        System.out.printf("Rata-rata dari bilangan kelipatan %d adalah %.2f \n", kelipatan, rataRata);

    }
}
