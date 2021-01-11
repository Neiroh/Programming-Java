//Este programa te muestra una interfaz que te permite hacer una serie de operaciones//
import java.util.Scanner;
public class Interfazcalculadora{
	public static void main (String args[]){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int op, n1, n2;

		do{
			System.out.println("Elige una opción");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Multiplicación");
			System.out.println("4.- División");
			System.out.println("5.- Calcular el resto de una división");
			System.out.println("6.- Salir");

			op = sc.nextInt();

			if (op>0 && op<6){
				System.out.println("Inserta dos números");
				n1 = sc.nextInt();

				n2 = sc.nextInt();

				switch (op){
					case 1: System.out.println("La suma es "+(n1+n2));
							System.out.println(""); break;
					case 2: System.out.println("La resta es "+(n1-n2));
							System.out.println(""); break;
					case 3: System.out.println("La multiplicación es "+(n1*n2));
							System.out.println(""); break;
					case 4: System.out.println("La división es "+(n1/n2));
							System.out.println(""); break;
					case 5: System.out.println("El resto de la división "+n1+ "/" +n2+ " es " +(n1%n2));
							System.out.println(""); break;
					case 6: System.exit (1);
				}
			}else if(op<=0 || op>=7){
				System.out.println("Esta opción no existe.");
				System.out.println("");
			}	
		}while (op!=6);
	}
}

