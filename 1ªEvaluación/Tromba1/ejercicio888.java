/*Importamos las librerías que necesitamos, en este caso la de 
  insertar valores por teclado*/
import java.util.Scanner;

public class ejercicio888 {

    //Este programa nos permite almacenar múltiplos de 3 la cantidad N que queramos

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos la variable i para usarla de contador en el bucle while

        int i = 0;

        /*Almacenamos en la variable cant la cantidad de números que queremos
        insertar*/

        System.out.println("Introduce la cantidad de múltiplos de 3 que quieres:");
        int cant = sc.nextInt();

        while (i < cant) {
            System.out.println("................................");
            System.out.println("Inserta un número múltiplo de 3:");
            int num = sc.nextInt();

            /*Almacenamos el operador i++ si se cumple la condición de que sea
            múltiplo de 3 ya que no nos interesa que el acumulador aumente si
            no es múltiplo de este*/

            if (num % 3 == 0) {
                i++;
            } else {
                System.out.println("Este número no es múltiplo de 3");
            }
        }
    }
}
