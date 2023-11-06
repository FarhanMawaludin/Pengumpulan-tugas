import java.util.Scanner;
public class TugasIndividu311{
    public static void main(String[] args) {
        int n;
        Scanner input11 = new Scanner(System.in);

        System.out.print("N : ");
        n = input11.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(n);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

