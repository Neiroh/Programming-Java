/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;
public class millaMetro {

	//Este programa va a pasar una unidad en millas a metros

	public static void main(String[] args) {

		//Declaramos el método de lectura

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta el dato que quieres pasar de milla a Metro");

		//Almacenamos las variables que necesitamos y la almacenamos en la variable
		//resultado para que nos sea más accesible

		double medida = sc.nextDouble();
		double resultado = 0;

		//realizamos la conversión de milla a metro ya que una milla es igual a 1852 metros

		resultado = medida*1852;

		System.out.println(medida+ " millas = " +resultado+ " metros");
	}
}