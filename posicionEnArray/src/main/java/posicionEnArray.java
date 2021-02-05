
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
public class posicionEnArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara Variables
        int lon;
        int num;
        
        System.out.println("Escoge la longitud del array..");
        lon = sc.nextInt();
        
        int[] array = new int[lon];
        
        for (int i = 0; i < lon; i++) {
            array[i] = (int) Math.floor(Math.random()*10);
        }
        
        System.out.println("Inserta el número que quieres encontrar..");
        num = sc.nextInt();
        
        System.out.println("La primera posición del número en el array array es.. " + posicionArray(array, num));
    }
    
    public static int posicionArray(int[] array, int num){
        
        int pos = -1;
        
        for(int i = 0; i < array.length; i++){
            if(num == array[i]){
                pos = i;
                break;
            }
        }
        
        return pos;
    }
}
