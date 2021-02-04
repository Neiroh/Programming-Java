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
import java.lang.Math;

public class binarioDecimal {

    //Este programa convierte, mediante un método de binario a decimal
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara Variables
        int binario;
        
        System.out.println("Ingresa el número en binario..");
        binario = sc.nextInt();
        
        System.out.println("El resultado de convertir " + binario + " a decimal es " + convierteDecimal(binario));
    }
    
    public static int convierteDecimal(int num){
                
        /*//Declara variables
        int decimal = 0;
        
        String numero = String.valueOf(num);
        char[] binario = numero.toCharArray();
        
        int pos = binario.length;
                        
        for (int i = 0; i < binario.length; i++){
            System.out.println(binario[i]);
            decimal += binario[pos]*Math.pow(2, i);
            pos--;
        }*/
        
        int digito = 0;
        int decimal = 0;
        int finaliza = num;
        int pos = 0;
        
        while (finaliza != 0){
            digito = finaliza % 10;
            decimal += digito*Math.pow(2, pos);
            finaliza /= 10;
            pos ++;
        } 
        
        return decimal;
    }
}
