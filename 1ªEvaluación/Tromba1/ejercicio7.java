/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;

public class ejercicio7 {

    //Este programa nos va a permitir almacenar 100 números pares

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos la variable que vamos a usar para aumentar el contador

        int i = 0;

        /*Usamos el bucle while para así solo aumentar el acumulador cuando
        el número insertado es par, y no impar*/

        while (i < 100) {
            System.out.println("Introduce un número par");
            double num = sc.nextDouble();
            //Realizamos la operación MOD usando el operador % y así saber si el número es par
            if ((num % 2) == 0) {
                i++;
            } else {
                System.out.println("Este número no es par, inténtelo de nuevo");
            }
        }
    }
}