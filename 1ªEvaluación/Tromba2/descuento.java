/*Importamos la libreria que nos permite
almacenar valores escritos por teclado*/
import java.util.Scanner;
public class descuento{

	/*Este programa nos sirve para calcular el porcentaje descontado de una
	compra, sabiendo el precio de la tarifa, y el precio pagado*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Pedimos al usuario el precio de la tarifa

		System.out.println("Inserta el precio de la tarifa");
		double tarifa = sc.nextDouble();

		//Pedimos al usuario la cantidad que ha pagado

		System.out.println("Inserta la cantidad pagada");
		double pago = sc.nextDouble();

		//Declaramos la variable sobre la que vams a realizar el cálculo

		double resultado = 0;

		//Realizamos el proceso para calcular el porcentaje

		resultado=pago/tarifa;
		resultado=1-resultado;
		resultado=resultado*100;

		System.out.println("El porcentaje descontado es de: " +resultado+ "%");
	}
}