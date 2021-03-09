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
public class Cuadrado extends Figura{

    //Atributos
    private double lado1;
    private double lado2;
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(double lado1, double lado2){
        super(3.7, 5.7);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public boolean equals(Cuadrado other){
        if(lado1 == other.getLado1() && lado2 == other.getLado2()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public double calcularArea(){
        
        final double area = lado1*lado2;
        
        return area;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
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
