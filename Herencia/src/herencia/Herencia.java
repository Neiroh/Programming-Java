/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import geometria.Circulo;
import geometria.Cuadrado;
import geometria.Forma;
import geometria.Triangulo;

/**
 *
 * @author profesor
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Forma f = new Forma();
        f.calcularArea();
        
        Cuadrado c = new Cuadrado(2.5);
        
        c.calcularArea();
        
        Circulo cir = new Circulo(5);
        
        cir.calcularArea();
        
        Triangulo t = new Triangulo(3);
        
        System.out.println(f.toString());
        System.out.println(c.toString());
        System.out.println(cir.toString());
        System.out.println(t.toString());
    }
    
}
