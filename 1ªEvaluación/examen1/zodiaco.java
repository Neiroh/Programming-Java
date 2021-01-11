import java.util.Scanner;

public class zodiaco{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.- Aries");
		System.out.println("2.- Tauro");
		System.out.println("3.- Géminis");
		System.out.println("4.- Cáncer");
		System.out.println("5.- Leo");
		System.out.println("6.- Virgo");
		System.out.println("7.- Libra");
		System.out.println("8.- Escorpio");
		System.out.println("9.- Sagitario");
		System.out.println("10.- Capricornio");
		System.out.println("11.- Acuario");
		System.out.println("12.- Piscis");
		System.out.println();
		System.out.println("Inserta número de signo:");

		int num = sc.nextInt();

		if(num == 1 || num == 5 || num == 9){
			System.out.println("Es un signo de Fuego");
		}else if(num == 2 || num == 6 || num == 10){
			System.out.println("Es un signo de Tierra");
		}else if(num == 3 || num == 7 || num == 11){
			System.out.println("Es un signo de Aire");
		}else if(num == 4 || num == 8 || num == 12){
			System.out.println("Es un signo de Agua");
		}else{
			System.out.println("ERROR: " +num+ " no está asociado a ningún signo");
		}
	}
}