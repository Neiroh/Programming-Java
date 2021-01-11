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

public class conversorMbKb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Este programa convierte de Mb a Kb y viceversa*/
        
        int opt = 1;

        do{
            double resultado = 0;
            
            System.out.println("Elige la Opción que quieres usar:");
            System.out.println("1.- Pasar de Mb a Kb");
            System.out.println("2.- Pasar de Kb a Mb");
            System.out.println("3.- Salir");

            opt = sc.nextInt();

            if(opt==1){
                System.out.println("Escribe la cantidad de Mb a convertir:");
                double unidad = sc.nextDouble();
                resultado = unidad*1000;

                System.out.println("El resultado es de " +resultado+ " Kb");
            }else if(opt==2){
                System.out.println("Escribe la cantidad de Mb a convertir:");
                double unidad = sc.nextDouble();
                resultado = unidad/1000;

                System.out.println("El resultado es de " +resultado+ " Mb");
            }
        }while(opt!=1 && opt!=2);
    }
}
