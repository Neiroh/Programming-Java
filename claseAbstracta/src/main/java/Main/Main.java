/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Figura.Circulo;
import Figura.Cuadrado;
import Figura.Figura;
import Figura.Triangulo;

/**
 *
 * @author Neiroh
 */
public class Main {

    public static void main(String[] args) {
        
        Figura[] fig = new Figura[3];
        fig[0] = new Circulo(2); //12,56
        fig[1] = new Cuadrado(2, 2); //4
        fig[2] = new Triangulo(2, 2); //2
        
        double suma = 12.56+4+2;
        
        System.out.println("El resultado es.. " + calcularArea(fig) + " = " + suma);
    }
    
    public static double calcularArea(Figura[] fig){
        
        double resultado = 0;
        
        for(int i = 0; i < fig.length; i++){
            resultado += fig[i].calcularArea();
        }
        
        return resultado;
    }
}
