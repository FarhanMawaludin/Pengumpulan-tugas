public class Terimakasih11 {
    public static void ucapanTerimaKasih(){
        System.out.println("Thank you for being the best teacher in the world.\n"+
        "You inspired in me love for learning and made me feel like I could ask you anything.");
    }

    public static void ucapanTambahan(String ucapan){
        System.out.println(ucapan);
    }
    
    public static void main(String[] args){
        ucapanTerimaKasih();
        String ucapan = "Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        ucapanTambahan(ucapan);
    }
}

