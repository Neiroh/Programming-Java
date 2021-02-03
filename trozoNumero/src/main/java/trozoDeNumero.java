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

public class trozoDeNumero {

    //Este programa devuelve un segmento de número
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara variables
        int num;
        int pos1;
        int pos2;
        
        System.out.println("Ingresa un número..");
        num = sc.nextInt();
        
        System.out.println("Ingresa la posición del inicio del segmento..");
        pos1 = sc.nextInt();
        
        System.out.println("Ingresa la posición del final del segmento..");
        pos2 = sc.nextInt();
        
        System.out.println("El resultado final es.. " + troceaNumero(num,pos1,pos2));
    }
     
    public static int troceaNumero(int num, int pos1, int pos2){
        String numero = String.valueOf(num);
                
        int segmento = Integer.parseInt(numero.substring(pos1, pos2));
        
        return segmento;
    }
}
