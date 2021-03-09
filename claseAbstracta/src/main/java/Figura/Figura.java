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
public abstract class Figura {

    //Atributos
    protected double x;
    protected double y;
    
    public Figura(){
        
    }
    
    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public boolean equals(Figura other){
        if(x == other.getX() && y == other.getY()){
            return true;
        }else{
            return false;
        }
    }
    
    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura{" + "x=" + x + ", y=" + y + '}';
    }    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
