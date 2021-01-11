/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;
public class ejercicio8 {

    //Este programa nos va a permitir insertar N números impares que nosotros queramos

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números impares que quieres:");

        //Almacenamos la cantidad de números que queremos insertar en la variable cant

        int cant = sc.nextInt();

        //Declaramos la variable i para usarla de contador en el while

        int i = 0;

        while (i < cant) {
            System.out.println("........................");
            System.out.println("Inserta un número impar:");
            int num = sc.nextInt();

            /*insertamos el operador i++ si se cumple la condición ya
            que no nos interesa que cuente los números impares
            en el proceso*/
            
            if (num % 2 != 0) {
                i++;
            } else {
                System.out.println("Este número no es impar");
            }
        }
    }
}
