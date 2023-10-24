import java.util.Scanner;
public class ifkondisi11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);

        System.out.println("Masukan Suhu");
        int suhu = sc11.nextInt();

        if ( suhu < 16) {
        System.out.println("silahkan pakai jaket");
        }
        if (suhu < 20 ) {
            System.out.println("Silahkan pakai baju tebal");
        }else{
            System.out.println("Silahkan Pakai Topi");
        }
    }
}
