/*Importamos las librerías que necesitamos, en este caso la de 
insertar valores por teclado*/
import java.util.Scanner;
public class ejercicio2{

	//Este programa va a comparar 2 números, y va a mostrar cual es mayor de los 2

	public static void main(String[] args) {

		//Declaramos el método de lectura por teclado

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta 2 números diferentes:");

		//Almacenamos en las variables los datos que el usuario va a insertar

		double n1=sc.nextDouble();
		double n2=sc.nextDouble();

		//Usamos la sentencia if para realizar la comparación

		if(n1==n2){
			System.out.println("Inserta 2 valores distintos");
		}else if(n1<n2){
			System.out.println(n2+ " es mayor que " +n1);
		}else{
			System.out.println(n1+ " es mayor que " +n2);
		}
	}
}