//Importamos la libreria para leer datos por teclado
import java.util.Scanner;
public class tiempo{

	//Este programa pasa a horas, minutos y segundos un dato insertado en segundos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas=0;
		int minutos=0;

		//Almacenamos en una variable el total de segundos

		System.out.println("Inserta el total de segundos que quieres convertir en h, mins, segs");
		int segundos = sc.nextInt();

			horas=segundos/3600;
			segundos=segundos%3600;
			minutos=segundos/60;
			segundos=segundos%60;

		System.out.println(horas+ "h " +minutos+ "minutos " +segundos+ "segs");
	}
}