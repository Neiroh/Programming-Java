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

public class pegaPorDetras {
    
    //Este programa pega un número detrás de otro
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara variables
        int num1;
        int num2;
        
        System.out.println("Ingresa un número..");
        num1 = sc.nextInt();
        
        System.out.println("Ingresa otro número..");
        num2 = sc.nextInt();
        
        System.out.print("El resultado final de juntar ambos números es.. ");
        pegaDetras(num1,num2);
    }
    
    public static void pegaDetras(int pega1, int pega2){
        
        System.out.println(pega1 + "" + pega2);
        
    }
}
