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

public class decimalBinario {
    
    //Este programa pasa, mediante una función, de decimal a binario
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara variables
        int decimal;
        
        System.out.println("Ingresa el número en decimal..");
        decimal = sc.nextInt();
        
        System.out.println("El resultado de.. " + decimal + " a binario es.. " + convierteBinario(decimal));
    }
    
    public static int convierteBinario(int num){
        
        //Declara variables
        double binario = 0;
        int digito = 0;
        int pos = 0;
        
        while(num!=0){
                digito = num % 2;           
                binario = binario + digito * Math.pow(10, pos);                                                   
                pos++;
                num = num/2;
        }
        return (int) binario;
    }
}
