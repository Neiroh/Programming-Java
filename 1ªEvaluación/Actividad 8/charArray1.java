import java.util.Arrays;

public class charArray1 {

	// Este programa ordena alfabéticamente un array de caracteres desordenados
	public static void main(String[] args) {

		// Inicializamos el array desordenado

		char[] cadena = new char[] { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H',
				'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };

		// Inicializamos el array donde vamos a guardarlo

		char[] cadenaFinal = new char[25];

		String cadenaString = cadena.toString();
		int n = 65;
		int posicion = 0;
		int unicode = 0;

		// Mostramos la lista desordenada por pantalla

		System.out.print("La lista desordenada: ");
		System.out.println(cadena);

		// Ordenamos el array con el método sort de array

		// Arrays.sort(cadena);

		/*
		 * Usamos un bucle para copiar los valores que hemos ordenado en su posición del
		 * otro array
		 */

		for (int i = 0; i <= cadena.length; i++) {
			unicode = cadenaString.codePointAt(i);
			if (n == unicode && posicion <= cadenaFinal.length) {
				cadenaFinal[posicion] = cadena[i];
				posicion++;
				i = 0;
			} else {
				System.out.print("La lista ordenada: ");
				System.out.println(cadenaFinal);
			}
		}

		/*
		 * for (int i = 0; i < cadena.length; i++) { for (int j = 65; j < 91;) { for (j
		 * = cadenaString.codePointAt(i); n < cadenaFinal.length; n++) { cadenaFinal[n]
		 * = cadena[i]; i = 0; j++; n++; } } }
		 */
		// System.out.print("La lista ordenada: ");
		// System.out.println(cadenaFinal);
	}
}