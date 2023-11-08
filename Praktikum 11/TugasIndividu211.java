import java.util.Scanner;
public class TugasIndividu211 {
    public static void main(String[] args) {
    Scanner input11 = new Scanner(System.in);
    System.out.print("Masukan Nilai N: ");
    int n = input11.nextInt();
    
    for (int i = n; i >0; i--) {
        
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}