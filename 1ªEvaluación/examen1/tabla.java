import java.util.Scanner;

public class tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do{
            System.out.println("Inserta un numero");
        
            int num = sc.nextInt();

            for (int i = 1; i < 11; i++) {
                System.out.println(num + "*" + i + "=" + num * i);
            }
            System.out.println("¿Desea ver otra tabla? (s/n)");
            opcion = sc.next();
        }while (opcion.equalsIgnoreCase("s"));
    }
}