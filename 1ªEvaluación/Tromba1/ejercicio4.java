/*Importamos las librerías que necesitamos, en este caso la de 
  insertar valores por teclado y algunas operaciones matemáticas
  complejas*/

import java.lang.Math;
import java.util.Scanner;
public class ejercicio4{

	//Este programa va a calcular la hipotenusa de un triángulo sabiendo la medida de 2 catetos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta la medida de los catetos:");

		//Declaramos la medida de los catetos

		double cateto1 = sc.nextDouble();
		double cateto2 = sc.nextDouble();
		double hipotenusa;

		//h²=a²+b² --> h=sqrt(a²+b²)

		hipotenusa=Math.sqrt(cateto1*cateto1 + cateto2*cateto2);

		System.out.println("La hipotenusa mide " +hipotenusa);
	}
}