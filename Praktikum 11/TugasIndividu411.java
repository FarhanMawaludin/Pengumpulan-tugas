import java.util.Scanner;
public class TugasIndividu411 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukan jumlah N: ");
        int n = input11.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
