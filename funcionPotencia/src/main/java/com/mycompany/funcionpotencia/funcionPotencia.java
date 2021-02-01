/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funcionpotencia;

/**
 *
 * @author arce
 */
import java.util.Scanner;
import java.lang.Math;

public class funcionPotencia {
    
    /*Este programa pide al usuario una base y un exponente, y mediante el método calculaPotencia, devuelve el resultado*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declara Variables
        int base;
        int exponente;
        
        System.out.println("Inserta la base..");
        base = sc.nextInt();
        
        System.out.println("Inserta el exponente");
        exponente = sc.nextInt();
        
        System.out.println("El resultado es.. " + calculaPotencia(base, exponente));
    }
    
    public static int calculaPotencia(int base, int exp){
        int resultado;
        
        resultado = (int) Math.pow(base, exp);
        
        return resultado;
    }
}
