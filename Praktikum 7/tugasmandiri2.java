import java.util.Scanner;
public class tugasmandiri2 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        String nama, jenisKelamin;
        int jumlahMahasiswa =30;

        int a = 1;

        for (a = 1 ; a <= jumlahMahasiswa ; a++) {
            System.out.print("Masukan Nama : ");
            nama = input11.nextLine();
            System.out.print("Masukan Jenis kelamin (L/P) : ");
            jenisKelamin = input11.nextLine();

            // haikal ganteng
            if (jenisKelamin.equalsIgnoreCase("P")){
                System.out.println( "Mahasiswa Perempuan " + nama);
                
            }
            }
            
        }

        
    }    

