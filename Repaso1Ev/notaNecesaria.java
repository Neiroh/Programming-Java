import java.util.Scanner;

public class notaNecesaria{

	/*Este programa calcula la nota necesaria en el segundo examen para sacar 
	la deseada por el usuario sabiendo la nota del primer examen*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double notaUsuario = 0;
		double notaDeseada = 0;
		double notaNecesaria = 0;
		double notaSegundo = 0;

		System.out.println("Introduzca la nota del primer examen:");
		notaUsuario = sc.nextDouble();

		System.out.println("¿Qué nota quieres sacar en el trimestre?");
		notaDeseada = sc.nextDouble();

		/*Primero probamos que la nota sea correcta a base de IF*/

		if(notaUsuario<=10 && notaUsuario>=0){
			if(notaDeseada<=10 && notaDeseada>=0){

				/*Ahora empezamos con el proceso de cálculo del 40% del primer examen*/

				notaUsuario *= 40;
				notaUsuario /= 100;

				/*notaUsuario + notaSegundo = notaDeseada -->
				Despejamos la incógnita, en este caso notaSegundo
				notaSegundo = notaDeseada - notaUsuario*/

				notaSegundo = notaDeseada - notaUsuario;
				notaSegundo *= 100;
				notaSegundo /= 60;
				
				System.out.println("Para tener un " + notaDeseada + " necesitas sacar un " + notaSegundo + " en el segundo examen");

			}
		}
	}

}