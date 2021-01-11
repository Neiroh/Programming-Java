//importamos la librería para declarar vareiables por teclado
import java.util.Scanner;

public class ejercicio1{

	//Este programa va a realizar una suma de dos operandos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta 2 números:");

		//Declaramos por teclado las variables de los datos que vamos a operar

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double resultado;

		//Guardamos el resultado de la operación en otra variable para que sea más accesible

		resultado = n1+n2;

		System.out.println("El resultado es " +resultado);
	}
}