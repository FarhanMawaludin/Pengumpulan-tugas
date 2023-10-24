import java.util.Scanner;
public class individu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String meleeWeapon, rangeWeapon;
        

        System.out.print("Silahkan Masukan Jarak : ");
        int jarak = input.nextInt();

        if( jarak < 5) {
            System.out.println("Silahkan gunakan Melee Weapon");
        }
        else{
            System.out.println("Silahkan gunakan Range Weapon");
        }
    }
}
