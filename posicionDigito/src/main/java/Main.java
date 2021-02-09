/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiroh
 */
import java.util.Scanner;

public class Main {

    /*Este programa, mediante una función, te localiza la posición de la primera ocurrencia de un número
    y si no lo encuentra, devuelve -1*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara variables
        int num;
        int oc;
        
        System.out.println("Ingresa un número..");
        num = sc.nextInt();
        
        System.out.println("Ingresa el número que quieres localizar..");
        oc = sc.nextInt();
        
        System.out.println("La primera ocurrencia del número se encuentra en la posición.. " + posicionDigito(num, oc));
    }
    
    //Esta función se encarga de encontrar la primera ocurrencia de un número
    //@param num es el número entero
    //@param x es la ocurrencia que queremos encontrar
    public static int posicionDigito(int num, int x){
        String numS = String.valueOf(num);
        char[] numC = numS.toCharArray();
        int pos = -1;
        String ocurrencia = String.valueOf(x);
        char[] oc = ocurrencia.toCharArray();
        
        for(int i = 0; i < numC.length; i++){
            //System.out.println(numC[i]);
            if(oc[0] == numC[i]){
                pos = i + 1;
                break;
            }
        }
        
        return pos;
    }
}
