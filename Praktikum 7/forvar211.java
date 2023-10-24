import java.util.Scanner;
public class forvar211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil;
        boolean berhenti = false;
        for (;!berhenti;) {
            System.out.print("Masukan Bilangan: ");
            bil = sc.nextInt();
            System.out.println("Bilangan yang anda masukan: " + bil);
            if (bil == 0) {
                berhenti = true;
            }
        }
        System.out.println("Program berakhir");
    }
}
