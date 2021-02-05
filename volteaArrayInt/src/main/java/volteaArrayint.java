
import java.util.Arrays;
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
public class volteaArrayint {
    
    
    
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
        
        System.out.println("El array volteado es.. " + volteaArray(array));
    }
    
    public static String volteaArray(int[] array){
        
        int[] arrayVolteado = new int[array.length];
        
        for(int i = 0; i < array.length - 1; i++){
                //System.out.println(array[i]);
            for(int j = array.length - 1; j > -1; j--){
                arrayVolteado[i] = array[j];
                //System.out.println(arrayVolteado[i]);
            }
        }
        
        return Arrays.toString(arrayVolteado);
    }
}
