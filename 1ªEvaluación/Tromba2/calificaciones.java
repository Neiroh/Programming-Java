//Importamos la librería para insertar datos por teclado
import java.util.Scanner;
public class calificaciones{

	//Este programa convierte calificaciones numéricas a letras

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta tu nota:");

		int nota = sc.nextInt();

		if (nota>20 || nota<1){
			System.out.println("Este número no es válido");
		}else{
			switch(nota){
				case 20: System.out.println("A");
				case 19: System.out.println("A");
				case 18: System.out.println("B");
				case 17: System.out.println("B");
				case 16: System.out.println("B");
				case 15: System.out.println("C");
				case 14: System.out.println("C");
				case 13: System.out.println("C");
				case 12: System.out.println("D");
				case 11: System.out.println("D");
				case 10: System.out.println("D");
				default: System.out.println("E");
			}
		}
	}
}