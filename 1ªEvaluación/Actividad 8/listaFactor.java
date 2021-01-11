public class listaFactor {

    // Este programa muestra la lista de factoriales del 1 al 10
    public static void main(String[] args) {

        /*
         * Usamos la variable n para el numero que vamos a multiplicar por el factorial
         * factor lo usamos para el resultado final del factorial; i lo usamos para el
         * numero que vamos a factorizar
         */

        int n = 10;
        int factor = 1;
        int i = 1;

        while (i != 11) {
            while (n != 1) {
                factor = n * factor;
                n--;
            }
            n = 10 - i;
            System.out.println((n + 1) + "! = " + factor);
            i++;

            // Igualamos factor a 1 para volver al principio del proceso de multiplicación

            factor = 1;
        }
    }
}
