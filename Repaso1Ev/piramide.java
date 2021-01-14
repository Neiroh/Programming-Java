import java.util.Scanner;

public class piramide {

	/*Este programa crea una pirámide que contiene un símbolo que el usuario
	elige y le da a elegir al usuario si el pico se encuentra hacia arriba o hacia abajo*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Pedimos al usuario el símbolo que quiere

		System.out.println("Inserta el símbolo que quieres que forme la pirámide");
		String simbol = sc.next();

		System.out.println("Inserta el número de líneas que quieres");
		int num = sc.nextInt();

		//Damos a elegir al usuario las direcciones

		System.out.println("Elige hacia qué dirección quieres que vaya el pico");
		System.out.println("1.- Arriba");
		System.out.println("2.- Abajo");
		System.out.println("3.- Izquierda");
		System.out.println("4.- Deresha");
		System.out.println("5.- Salir");
		int opt = sc.nextInt();

		while(opt != 5){
			if(opt == 1){

				for(int i = 0; i <= num/2-1; i++){
					System.out.print(" ");
					for(int j = 0; j <= num; j++){
						for(int k = 0; k <= num; k++){
							System.out.print(simbol);
						}
						System.out.println();
					}
				}

			}else if (opt == 2){

				for(int i = 0; i <= num/2-1; i++){
					for(int j = 0; j <= num; j++){
						for(int k = 0; k <= num; k++){
							System.out.print(simbol);
							num--;
						}
						System.out.println();
					}
				}	

			}else if (opt == 3){

				for(int i = 0; i <= num/2-1; i++){
					for(int j = 0; i <= num; j++){
						for(int k = 0; j <= num; k++){
							System.out.print(simbol);
						}
						System.out.println();
					}
				}	

			}else if (opt == 4){

				for(int i = 0; i <= num/2-1; i++){
					for(int j = 0; i <= num; i++){
						for(int k = 0; j <= num; j++){
							System.out.print(simbol);
						}
						System.out.println();
					}
				}

			}else{

				//Comprobamos que la opción se encuentre dentro de los valores definidos

				System.out.println("La opción elegida no es correcta");
			}
		}	
	}
}