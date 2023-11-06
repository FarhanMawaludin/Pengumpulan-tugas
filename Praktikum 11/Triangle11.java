import java.util.Scanner;
public class Triangle11 {
    public static void main(String[] args) {
    Scanner input11 = new Scanner(System.in);
    System.out.print("Masukan Nilai N: ");
    int n = input11.nextInt();
    int i = 0;
    while(i<=n){
        int j = 0;
        while(j<i){
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
    }
}