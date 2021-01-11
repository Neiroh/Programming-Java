/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;

public class ejercicio88 {

    //Este programa nos permite introducir los números pares que vamos a almacenar

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos la variable i para usarla de contador en el while

        int i = 0;

        //Pedimos al usuario la cantidad que quiere

        System.out.println("Introduce la cantidad de números pares que quieres:");
        int cant = sc.nextInt();

        while (i < cant) {
            System.out.println("......................");
            System.out.println("Inserta un número par:");
            int num = sc.nextInt();

            /*Almacenamos el operador i++ en el if 
            ya que no nos interesa almacenar números impares*/

            if (num % 2 == 0) {
                i++;
            } else {
                System.out.println("Este número no es par");
            }
        }
    }
}
