import java.util.Scanner;

public class parking {

	// Este programa calcula el precio a pagar en un parking
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double precio = 0;

		// Pedimos la hora y los minutos al usuario

		System.out.println(
				"Inserta la hora a la que entraste en el parking separando la hora de los minutos con un espacio");
		int horaE = sc.nextInt();
		int minutoE = sc.nextInt();

		System.out.println(
				"Inserta la hora a la que saliste del parking separando las horas de los minutos con un espacio");
		int horaS = sc.nextInt();
		int minutoS = sc.nextInt();

		// Comprobamos que la hora y los minutos sean correctos

		if (horaE <= 24 && horaE >= 0 && horaS <= 24 && horaS >= 0) {
			if (minutoE <= 60 && minutoE >= 0 && minutoS < 60 && minutoS >= 0) {

				// Si son correctos comenzamos la operación

				// Restamos los minutos de salida con los de entrada y lo mismo con las horas
				// para calcular el precio fácilmente

				minutoS = minutoS - minutoE;
				horaS = horaS - horaE;
				if (minutoS > 0 && horaS == 0) {
					precio = 1.2;
				} else if (minutoS <= 0 && horaS == 1) {
					precio = 1.2;
				} else if (minutoS > 0 && horaS > 1) {
					precio = 1.2 + horaS;
				} else if (minutoS <= 0 && horaS > 1) {
					precio = 1.2 + (horaS - 1);
				} else if (minutoS <= 0 && horaS < 0) {
					horaS = horaS + 23;
					precio = 1.2 + horaS;
				} else if (minutoS > 0 && horaS < 0) {
					horaS = horaS + 24;
					precio = 1.2 + horaS;
				} else if (minutoS > 0 && horaS == 1) {
					precio = 1.2 + horaS;
				} else {
					horaS = horaS + 24;
					precio = 1.2 + horaS;
				}

				// Mostramos el resultado por pantalla

				System.out.println("El precio a pagar es de: " + precio);
			} else {

				// Indicamos al usuario que el dato insertado en los minutos no es correcto

				System.out.println("Los minutos insertados no son correctos");
			}

			// Indicamos al usuario que el dato insertado en las horas no es correcto

		} else {
			System.out.println("Las horas insertadas no son corrextas");
		}
	}
}