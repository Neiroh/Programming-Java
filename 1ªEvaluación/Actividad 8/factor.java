import java.util.Scanner;

public class factor {

    // Este programa calcula el factorial de un número
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos el número al usuario

        System.out.println("Inserta el número del que quieres calcular el factorial:");
        int n = sc.nextInt();

        /*
         * Inicializamos la variable que no depende del usuario, para almacenar el
         * cálculo
         */

        int factor = 1;

        while (n != 1) {
            factor = factor * n;
            n--;
        }
        System.out.println("El factorial es: " + factor);
    }
}
