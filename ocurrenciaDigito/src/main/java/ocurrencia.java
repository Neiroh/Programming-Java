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

public class ocurrencia {

    /*Este programa devuelve la posición de la primera ocurrencia de un número insertado*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int ocurrencia;
        
        System.out.println("Ingresa un número..");
        num = sc.nextInt();
        
        System.out.println("Ingresa qué número quieres detectar..");
        ocurrencia = sc.nextInt();
        
        System.out.println("La primera ocurrencia se encuentra en la posición .. " +detectaOcurrencia(num,ocurrencia));
    }
    
    public static int detectaOcurrencia(int num, int ocurrencia){
        String numero = String.valueOf(num);
        char[] numeroC = numero.toCharArray();
        String ocurrenciaS = String.valueOf(ocurrencia);
        int pos = -1;
        
        for (int i = 0; i < numeroC.length; i++) {
            if (ocurrenciaS.equals(numeroC[i])){
                pos = i;
            }
        }
        return pos;
    }
}
