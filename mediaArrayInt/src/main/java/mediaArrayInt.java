
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */

public class mediaArrayInt {
    
    /*Este programa muestra mediante una función, la media de un array*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara Variables
        int lon;
        
        System.out.println("Escoge la longitud del array..");
        lon = sc.nextInt();
        
        int[] array = new int[lon];
        
        for (int i = 0; i < lon; i++) {
            System.out.println("Inserta un valor..");
            array[i] = sc.nextInt();
        }
        
        System.out.println("El valor mínimo del array es.. " + mediaArray(array));
    }
    
    public static int mediaArray(int[] array){
        
        int media = 0;
        
        for(int i = 0; i < array.length; i++){
            
            media += array[i];
            
        }
        
        media /= array.length;
        
        return media;
    }
}
