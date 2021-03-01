/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author profesor
 */
public class Cuadrado extends Forma {
    
    public double lado;
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(double lado){
        super("Cuadrado", 3);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{\n" + "lado=" + lado + "\nNombre: " + getNombre() + "\n}\n\n";
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del cuadrado es .. " + lado*lado);
    }
}
