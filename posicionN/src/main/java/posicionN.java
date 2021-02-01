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

public class posicionN {
    
    /*Devuelve el dígito que se encuentra en la posición N dada por el usuario*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int posicion;
        
        System.out.println("Ingresa un número..");
        num = sc.nextInt();
        
        System.out.println("Ingresa la posición de la que quiere sacar el número (0+)..");
        posicion = sc.nextInt();
        
        System.out.println("El número que se encuentra en la posición " + posicion + " del número " + num + " es " + devuelvePosicion(num, posicion));
        
    }
    
    public static int devuelvePosicion(int num, int pos){
        String almacenS = String.valueOf(num);
        char[] numDado = almacenS.toCharArray();
        
        int almacen = Character.getNumericValue(numDado[pos]);
           
        return almacen;
    }
}
