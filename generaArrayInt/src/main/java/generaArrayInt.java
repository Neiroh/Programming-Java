/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
import java.util.Arrays;
import java.util.Scanner;

public class generaArrayInt {
    
    //Mediante una función genera un array ded int
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresa el tamaño del array.. ");
        int n = sc.nextInt();
        
        System.out.println("Ingresa el valor mínimo del array..");
        int min = sc.nextInt();
        
        System.out.println("Ingresa el valor máximo del array..");
        int max = sc.nextInt();
        
        System.out.println("El array es.. " + generaArray(n, min, max));
    }
    
    public static String generaArray(int lon, int min, int max){
        
        int[] array = new int[lon - 1];
        
        for(int i = 0; i < array.length; i++){
            
            array[i] = (int) Math.floor(Math.random()*max + min);
            
        }
        
        return Arrays.toString(array);
    }
}
