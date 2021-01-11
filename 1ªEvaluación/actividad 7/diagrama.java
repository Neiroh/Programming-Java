import java.util.Scanner;

public class diagrama {

    // Este programa en decenas y unidades de millar un numer
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // inicializamos los valores donde vamos a almacenar la cantidad de cifras

        int bc = 0;
        int bv = 0;
        int bd = 0;
        int bc2 = 0;
        int bm = 0;
        int resto = 0;
        int n = 0;

        // Pedimos el número por teclado y lo almacenamos en c

        System.out.println("Inserta un número:");

        int c = sc.nextInt();

        // Almacenamos el valor en otro dato para usarlo en el resultado

        n = c;

        // Comenzamos a calcular

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

        // Mostramos el resultado por pantalla

        System.out.println("El número insertado es " + n);
        System.out.println("El número tiene " + bc + " en 5 decenas de millar");
        System.out.println("El número tiene " + bv + " en 2 decenas de millar");
        System.out.println("El número tiene " + bd + " en 1 decena de millar");
        System.out.println("El número tiene " + bc2 + " en 5 unidades de millar");
        System.out.println("El número tiene " + bm + " unidades de millar");
        System.out.println("El número tiene " + resto + " unidades");
    }
}
