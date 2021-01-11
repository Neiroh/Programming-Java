public class notaTest {

    public static void main(String[] args) {
        int nota = 30;
        nota = nota - (10/2);

        if (nota >= 36) {
            System.out.println("Sobresaliente");
        } else if (nota < 36 && nota >= 28) {
            System.out.println("Notable");
        } else if (nota >= 24 && nota < 28) {
            System.out.println("Bien");
        } else if (nota >= 20 && nota < 24) {
            System.out.println("Suficiente");
        } else (nota < 20) {
            System.out.println("Insuficiente");
        }
    }
}