import java.util.Scanner;

public class UcapanTerimaKasih11 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tulis NAMA yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+ "You inspired in me love for learning and made me feel like I could ask you anything.");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
     public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapanTambahan = "Semoga sukses selalu!";
        UcapanTambahan(ucapanTambahan);
    }
}
