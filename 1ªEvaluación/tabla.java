import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un numero");
        int num = sc.nextInt();
        int x = 11;
        int opcion = 1;

        while (opcion == 1) {
            for (int i = 1; i < x; i++) {
                System.out.println(num + "*" + i + "=" + num * i);
            }
            x = x + 10;
            System.out.println("Quieres seguir? Escribe 1 para sí y 2 para no");
            opcion = sc.nextInt();
        }
    }
}