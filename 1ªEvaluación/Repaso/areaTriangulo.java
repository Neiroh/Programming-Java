/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
import java.util.Scanner;

public class areaTriangulo {

    /* Esta clase calcula el área de un triángulo */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base = 0;
        double altura = 0;
        double area = 0;

        System.out.println("Escribe la medida de la base del triángulo en cm: ");
        base = sc.nextDouble();

        System.out.println("Escribe la medida de la altura del triángulo en cm: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.println("El área del triángulo es de " + area + " cm");
    }
}
