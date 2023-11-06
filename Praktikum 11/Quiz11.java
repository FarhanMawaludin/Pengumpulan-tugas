import java.util.Scanner;
import java.util.Random;

public class Quiz11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input11 = new Scanner(System.in);
        char menu; 

        do {
            menu = 'y'; 
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input11.nextInt();
                input11.nextLine();
                if(answer == number) {
                    System.out.println("\nBenar! Angka yang tebak adalah " + number);
                }else if (answer < number){
                    System.out.println("\nAngka anda terlalu kecil!");

                }else{
                    System.out.println("\nAngka anda terlalu besar!");
                    success=false;
                }

            } while (!success);

            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input11.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y'); 
    }
}
