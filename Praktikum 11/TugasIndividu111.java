import java.util.Scanner;

public class TugasIndividu111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        int n;
        
        System.out.print("Masukkan N: ");
        n = input11.nextInt();
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
