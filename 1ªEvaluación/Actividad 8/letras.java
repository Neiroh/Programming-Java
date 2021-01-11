public class letras {

    // Este programa muestra un triangulo de caracteres
    public static void main(String[] args) {
        String cadena = "ZYWXVUTSRQPONMLKJIHGFEDCBA";

        // Vamos eliminando caracteres de uno en uno para realizar el triangulo

        // para eso hacemos que la medida de la cadena nunca llegue a 0

        while (cadena.length() != 1) {
            cadena = cadena.substring(1);
            System.out.println(cadena);
        }
    }
}
