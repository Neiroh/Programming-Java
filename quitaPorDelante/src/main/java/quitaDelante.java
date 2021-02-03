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
        
        System.out.print("El número final es.. ");
        quitaPorDelante(num,quita);
    }
    
    public static char[] quitaPorDelante(int num, int quita){
        String numero = String.valueOf(num);
        char[] numeroC = numero.toCharArray();
        
        int longitud = numeroC.length;
        int longFin = longitud - quita;
        char[] termina = new char[longFin];
        
        int n = 0;
        
        for(int i = quita; i < numeroC.length; i++){
            //System.out.print(numeroC[i]);
            termina[n] = numeroC[i];
            n++;
        }
        System.out.println(termina);
        return termina;
    }
}
