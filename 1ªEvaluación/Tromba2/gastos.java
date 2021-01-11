import java.util.Scanner;
public class gastos{

	/*Este programa sirve para:
	Calcular el consumo de gasolina por cada 100km
	Calcular el consumo de gasolina por cada km
	Calcular la velocidad media en km/h y en m/s*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserta el total de kilómetros recorridos");
		double km = sc.nextDouble();

		System.out.println("Inserta el precio de la gasolina por litro");
		double gasolina = sc.nextDouble();

		System.out.println("Inserta el dinero gastado por gasolina");
		double dineroGastado = sc.nextDouble();

		System.out.println("Inserta las horas que has tardado");
		int horas = sc.nextInt();

		System.out.println("Inserta los minutos que has tardado");
		int minutos = sc.nextInt();

		//Declaramos el resto de variables que no dependen del usuario

		double gasolina100 = 0;
		double dineroGastado100 = 0;
		double velocidad1 = 0;
		double velocidad2 = 0;
		int resultadoTiempo = 0;

		//Calculamos la gasolina y el dinero gastados por cada 100 km

		/*km --- gasolina
		100 ---- gasolina100*/

		gasolina100 = (gasolina*100)/km;

		/*km --- dineroGastado
		100 ---- dineroGastado100*/

		dineroGastado100 = (dineroGastado*100)/km;

		System.out.println("En 100km gastas: " +gasolina100+ " litros de gasolina");
		System.out.println("------------------------------------------------------------------");
		System.out.println("En 100km gastas: " +dineroGastado100+ "€");
		System.out.println("------------------------------------------------------------------");


		//Calculamos la gasolina y el dinero gastados por cada km

		gasolina = gasolina100/100;
		dineroGastado = dineroGastado100/100;

		System.out.println("En 1km gastas: " +gasolina+ " litros de gasolina");
		System.out.println("------------------------------------------------------------------");
		System.out.println("En 1km gastas: " +dineroGastado+ "€");
		System.out.println("------------------------------------------------------------------");

		//Calculamos ahora las velocidades

		resultadoTiempo = horas + minutos/60;
		velocidad1 = km/resultadoTiempo;
		velocidad2 = (km*1000)/(resultadoTiempo*3600);

		System.out.println("La velocidad media en km/h es de: " +velocidad1+ "km/h");
		System.out.println("------------------------------------------------------------------");
		System.out.println("La velocidad media en m/s es de: " +velocidad2+ "m/s");	
	}
}