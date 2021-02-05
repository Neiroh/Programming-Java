
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
public class estaEnArrayInt {
    
    /*Este programa muestra mediante una función, si el numero se encuentra en un array*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara Variables
        int lon;
        int num;
        
        System.out.println("Escoge la longitud del array..");
        lon = sc.nextInt();
        
        int[] array = new int[lon];
        
        for (int i = 0; i < lon; i++) {
            array[i] = (int) Math.floor(Math.random()*999);
        }
        
        System.out.println("Inserta el número que quieres encontrar..");
        num = sc.nextInt();
        
        System.out.println("El valor mínimo del array es.. " + encuentraArray(array, num));
    }
    
    public static boolean encuentraArray(int[] array, int num){
                
        for(int i = 0; i < array.length; i++){
            //System.out.println(array[i]);
            if (num == array[i]){
                return true;
            }
        }
        return false;
    }
}
