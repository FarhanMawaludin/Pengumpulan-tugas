import java.util.Scanner;
public class PemilihanPercobaan311 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukan Angka Pertama");
        angka1 = input11.nextDouble();
        System.out.print("Masukan Angka Kedua");
        angka2 = input11.nextDouble();
        System.out.print("Masukan Operator (+ - * /) :");
        operator = input11.next().charAt(0);

        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            break;
             case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
            break;
             case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
            break;
             case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;
        }



    }
    
}
