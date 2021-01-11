import java.util.Scanner;

public class diagrama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bc = 0;
        int bv = 0;
        int bd = 0;
        int bc2 = 0;
        int bm = 0;
        int resto = 0;
        int n = 0;

        System.out.println("Inserta un número:");

        int c = sc.nextInt();

        n = c;

        while (c >= 50000) {
            bc++;
            c = c - 50000;
        }
        while (c >= 20000) {
            bv++;
            c = c - 20000;
        }
        while (c >= 10000) {
            bd++;
            c = c - 10000;
        }
        while (c >= 5000) {
            bc2++;
            c = c - 5000;
        }
        while (c >= 1000) {
            bm++;
            c = c - 1000;
        }
        resto = c;

        System.out.println("El número insertado es " + n);
        System.out.println("El número tiene " + bc + " en 5 decenas de millar");
        System.out.println("El número tiene " + bv + " en 2 decenas de millar");
        System.out.println("El número tiene " + bd + " en 1 decena de millar");
        System.out.println("El número tiene " + bc2 + " en 5 unidades de millar");
        System.out.println("El número tiene " + bm + " unidades de millar");
        System.out.println("El número tiene " + resto + " unidades");
    }
}
