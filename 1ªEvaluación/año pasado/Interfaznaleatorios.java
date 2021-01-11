public class Interfaznaleatorios{
	public static void main(String args[]){
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int i;
		int op;
		int n1 = (int)(Math.random()*10+1);
		int dado1 = (int)(Math.random()*6+1);

		do{
			System.out.println("Generar 1 número aleatorio entre el 1 y el 10");
			System.out.println("Simular un lanzamiento de 2 dados");
			System.out.println("Simular el lanzamiento de 1 dado");
			System.out.println("Generar x números aleatorios entre dos numeros que eligas");	
			System.out.println("Salir");

			op = sc.nextInt();

			switch (op){
				case 1: System.out.println(+n1);
				case 2: for (i=0; i<2; i++){
							int dado2 = (int)(Math.random()*6+1);
							System.out.println(+dado2);
						}
				case 3: System.out.println(+dado1);
				case 4: System.out.println("Escribe la cantidad de números que quieres");
						int n2 = sc.nextInt();
						System.out.println("Escribe los dos números sobre los que se encuentran los números que quieres");
						int n3 = sc.nextInt();
						int n4 = sc.nextInt();
						for (i=0; i<=n2; i++){
							int n5 = (int)(Math.random()*n3+n4);
							System.out.println(+n5);
			}
		}while(op!=5);

			if (op==5){
				System.exit(1);
			}
		}