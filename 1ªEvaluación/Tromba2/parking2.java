import java.util.Scanner;

public class parking2 {

    // Este programa calcula la cantidad a pagar en un parking

    private static double precio;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precio = 0;

        // Pedimos el tiempo que ha estado estacionado el usuario

        System.out.println("Inserta la hora a la que has entrado al parking");
        int horaEntrada = sc.nextInt();
        System.out.println("Inserta el minuto al que has entrado al parking");
        int minutosEntrada = sc.nextInt();

        System.out.println("Inserta la hora a la que has salido del parking");
        int horaSalida = sc.nextInt();
        System.out.println("Inserta el minuto al que has salido del parking");
        double minutosSalida = sc.nextDouble();

        minutosSalida = minutosSalida - minutosEntrada;
        if (minutosSalida < 0) {
            horaSalida--;
            minutosSalida = 60 + minutosSalida;
        }
        if (horaSalida - horaEntrada < 0) {
            horaSalida = horaSalida + 24;
            precio = 1.2 + (horaSalida - (horaEntrada + 1) + minutosSalida / 60);
        } else {
            precio = 1.2 + (horaSalida - (horaEntrada + 1) + minutosSalida / 60);
        }
        System.out.println("El precio a pagar es de: " + precio);
    }
}