public class charArray0 {
    public static void main(String[] args) {

        char[] cadena = new char[] { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H',
                'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
        char[] cadenaFinal = new char[25];
        String cadenaString = cadena.toString();
        String letra;
        int n = 65;
        int posicion = 0;

        System.out.print("La lista desordenada: ");
        System.out.println(cadena);

        for (int i = 0; i < cadena.lenght; i++) {
            cadenaString.charAt(i);
            cadenaString.codePointAt(0);
            if (letra == n) {
                cadenaString.replace(i, posicion);
            }
        }

        System.out.print("La lista ordenada: ");
        System.out.println(cadenaString);
    }
}
