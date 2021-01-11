/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;
public class ejercicio6{

	/*Este programa nos pide N números que queremos insertar
	y la realización de la suma de todos los números que hemos insertado*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta la cantidad de números que vas a añadir:");

		/*num va a servirnos para los números con los que va a operar el usuario
		  n lo vamos a utilizar para calcular cuando terminamos el bucle
		  acumulador lo vamos a utilizar para almacenar ahí el resultado final*/

		int num;
		int n=sc.nextInt();
		int acumulador=0;

		for(int i=0; i<n; i++){
			System.out.println("Inserta un número:");
			num=sc.nextInt();
			acumulador = num+acumulador;
		}System.out.println("El resultado final es: "+acumulador);
	}
}