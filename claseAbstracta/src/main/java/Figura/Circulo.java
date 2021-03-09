/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figura;
/**
 *
 * @author Neiroh
 */
public class Circulo extends Figura{
    
    //Atributos
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        super(3, 2);
        this.radio = radio;
    }
    
    public boolean equals(Circulo other){
        if(radio == other.getRadio()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public double calcularArea(){
        
        final double area = Math.PI*Math.pow(radio, 2);
        
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }
    
    
}
