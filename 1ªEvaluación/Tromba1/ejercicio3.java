/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;
public class ejercicio3{

	/*Este programa va a leer 3 números por teclados, 
	y va a decir cual es el mayor
	y cual es el menor*/

	public static void main(String[] args) {

		//Declaramos el método de lectura por teclado

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta 3 números diferentes:");

		//Hacemos que el usuario inserte 3 valores en 3 variables distintas

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();

		//Usamos el if para realizar las operaciones lógicas y empezar a comparar los números

		if(n1==n2 || n2==n3 || n1==n3){
			System.out.println("Algunos valores coinciden, repita el proceso");
		}else if(n1>n2 && n1>n3){
			System.out.print(n1+ " es el mayor, ");
			
			if(n2>n3){
				System.out.println(n3+ " es el menor");
			}else{
				System.out.println(n2+ " es el menor");
			}
		}else if(n2>n1 && n2>n3){
			System.out.print(n2+ " es el mayor, ");

			if(n1>n3){
				System.out.println(n3+ " es el menor");
			}else{
				System.out.println(n1+ " es el menor");
			}
		}else if(n3>n1 && n3>n2){
			System.out.print(n3+ " es el mayor, ");

			if(n1>n2){
				System.out.println(n2+ " es el menor");
			}else{
				System.out.println(n1+ " es el menor");
			}
		}
	}
}