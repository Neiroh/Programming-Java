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

//Comentario inutil

public class numDigitos {
    
    /*Este programa cuenta, mediante la funcion cuentaDigitos, el número de dígitos de un número entero*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingresa un número..");
        num = sc.nextInt();
        
        System.out.println("El número " + num + " tiene " + cuentaDigitos(num) + " dígitos");
    }
    
    public static int cuentaDigitos(int x){
        
        int digitos;
        for (digitos = 1; x/10 != 0; digitos++) {
           
            x /= 10;
            
        }
        return digitos;
    }
}
