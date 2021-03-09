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
import java.util.Scanner;

/**
 *
 * @author Neiroh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántas figuras vas a ingresar?");
        int numFig = sc.nextInt();
        
        Figura[] fig = new Figura[numFig];
        
        for(int i = 0; i < numFig; i++){
            
            System.out.println("Elige el tipo de figura: \n1.- Círculo\n2.- Cuadrado\n3.- Triángulo");
            String figuraElegida = sc.next();
            
            if(figuraElegida.equalsIgnoreCase("Circulo") || figuraElegida.equalsIgnoreCase("1")){
                
                System.out.println("Ingresa la medida del radio..");
                final double radio = sc.nextDouble();
                
                System.out.println("");
                
                fig[i] = new Circulo(radio);
                
            }else if(figuraElegida.equalsIgnoreCase("cuadrado") || figuraElegida.equalsIgnoreCase("2")){
                
                System.out.println("Ingresa la medida del lado 1..");
                final double lado1 = sc.nextDouble();
                
                System.out.println("Ingresa la medida del lado 2..");
                final double lado2 = sc.nextDouble();
                
                System.out.println("");
                
                fig[i] = new Cuadrado(lado1, lado2);
                
            }else if(figuraElegida.equalsIgnoreCase("triangulo") || figuraElegida.equalsIgnoreCase("3")){
                
                System.out.println("Ingresa la medida de la base..");
                final double base = sc.nextDouble();
                
                System.out.println("Ingresa la medida de la altura..");
                final double altura = sc.nextDouble();
                
                System.out.println("");
                
                fig[i] = new Triangulo(base, altura);
                
            }else{
                System.out.println("OPCION INCORRECTA");
            }
        }
        
        
        //fig[0] = new Circulo(2); //12,56
        //fig[1] = new Cuadrado(2, 2); //4
        //fig[2] = new Triangulo(2, 2); //2
        
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
