/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class muestraPrimo {
    
    //Este programa muestra, mediante una función, los números primos desde 1 a 1000
    
    public static void main(String[] args) {
        
        muestraPrimos();
        
    }
    
    public static void muestraPrimos(){
        for(int i = 1; i < 1000; i++){
            int acumulador = 0;
            for (int j = 2; j < i; j++) {
               if(i % j == 0){
                   acumulador++;
                   break;
               }
            }
            if(acumulador == 0){
                System.out.println(i + " Es primo");
            }
        }
    }
}
