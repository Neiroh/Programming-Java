
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */
public class esPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta un número:");
        int num = sc.nextInt();
        
        if(esPrimo(num)){
            System.out.println("Es PRIMO");
        }else{
            System.out.println("Es NO PRIMO");
        }
    }
    
    public static boolean esPrimo(int num){
                
        for(int i = num-1; i > 1; i--){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
