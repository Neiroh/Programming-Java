/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */
import java.util.Scanner;

public class primoMayor {
    
    /*Este programa pide un número entero al usuario y le devuelve el siguiente primo más cercano*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingresa un número..");
        num = sc.nextInt();
                
        System.out.println("El siguiente número primo al dado es.. " + siguientePrimo(num));
    }
    
    /*Esta función calcula el siguiente número primo al dado*/
    
    public static int siguientePrimo(int num){

        num++;
        for (int i = num; i > 1; i--) {
            if(num%i == 0){
                num++;
            }
        }
        return num;
    }
}
