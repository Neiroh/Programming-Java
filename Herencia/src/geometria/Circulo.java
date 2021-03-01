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
public class Circulo extends Forma{
    
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        super("Círculo", 3);
        this.radio = radio;
    }

    @Override
    public String toString() {
        
        return "Circulo{\n" + "radio=" + radio + "\nNombre: " + getNombre() + "\n}\n\n";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del circulo es.. " + Math.PI*Math.pow(radio, 2));
    }
}
