import java.util.Scanner;
public class DoWhileCuti11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda Ingin mengambil cuti ? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")){
            System.out.print("Jumlah Hari : ");
            jumlahHari = sc.nextInt();

            if((jumlahHari <= jatahCuti)) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti " + jatahCuti);
            }else {
                System.out.println("Sisa jatah cuti anda tidak ada");
                break;
            }
            }else {
                System.out.println("Terimakasih anda tidak cuti");
                break;
            }
        }while(jatahCuti > 0);

        
    }
}
