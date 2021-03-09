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
public class Triangulo extends Figura{

    //Atributos
    private double base;
    private double altura;
    
    public Triangulo(){
        
    }
    
    public Triangulo(double base, double altura){
        super(2, 1.7);
        this.base = base;
        this.altura = altura;
    }
    
    public boolean equals(Triangulo other){
        if(base == other.getBase() && altura == getAltura()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public double calcularArea(){
        
        final double area = (base*altura)/2;
        
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
