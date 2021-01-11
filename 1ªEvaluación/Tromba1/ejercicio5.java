/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;
public class ejercicio5{

	//Este programa va a ir sumando números hasta que se inserten 100

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int acumulador=0;

		System.out.println("Inserta 100 números");

		//la sentencia for nos servirá para el bucle

		for(int i=0; i<100; i++){

			/*Leemos el número por teclado y realizamos la operación de suma
			  almacenándola en el acumulador para no perder el hilo de la operación*/

			num=sc.nextInt();
			acumulador=num + acumulador;
		}System.out.println(acumulador);
	}
}