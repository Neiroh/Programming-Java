public class charArray2 {
    public static void main(String[] args) {

        // Inicializamos el array desordenado

        char[] cadena = new char[] { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H',
                'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };

        // Inicializamos el array donde vamos a guardarlo

        char[] cadenaFinal = new char[25];

        String cadenaString = cadena.toString();
        int posicion = 0;

        for (int i = 0; i < cadena.length; i++) {
            for (int k = 0; k < cadenaFinal.length; k++) {
                for (int j = 65; j < 91; j++) {
                    if (cadenaString.codePointAt(i) == j) {
                        cadenaFinal[k] = cadena[i];
                    }
                }
            }
        }

        // Mostramos la lista desordenada por pantalla

        System.out.print("La lista desordenada: ");
        System.out.println(cadena);
    }
}
