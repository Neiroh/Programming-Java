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

public class quitaPorDetras {
    
    /*Quita n números desde el final del dado*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara Variables
        int num;
        int quita;
        
        System.out.println("Inserta un número.. ");
        num = sc.nextInt();
        
        System.out.println("Ingresa el número de posiciones que quieres quitar");
        quita = sc.nextInt();
        
        System.out.println("El número final es.. " +quitaNumeros(num,quita));
    }
    
    public static int quitaNumeros(int num, int cant){
        //String numero = String.valueOf(num);
        //char[] numC = numero.toCharArray();
        
        for (int i = 0; i < cant; i++) {
            num /= 10;
        }
        
        return num;
    }
}
