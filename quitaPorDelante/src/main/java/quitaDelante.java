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


public class quitaDelante {

    //Este programa quita valores en la parte delantera

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara variables
        int num;
        int quita;
        
        System.out.println("Ingresa un número..");
        num = sc.nextInt();
        
        System.out.println("Inserta cuantos numeros quieres quitar..");
        quita = sc.nextInt();
        
        System.out.println("El número final es.. " +quitaPorDelante(num,quita));
    }
    
    public static int quitaPorDelante(int num, int quita){
        String numero = String.valueOf(num);
        char[] numeroC = numero.toCharArray();
        
        for(int i = 0; i < numeroC)
        
        return num;
    }
}
