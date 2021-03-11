/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figura2D;

import Figura.Figura;

/**
 *
 * @author Neiroh
 */
public abstract class Figura2D extends Figura{

    //Atributos
    
    public Figura2D(){
        
    }
    
    public Figura2D(String nombre, int grosorBorde, int color){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }
    
    public boolean equals(Figura2D other){
        if(this.nombre.equals(other.nombre) && this.grosorBorde == other.grosorBorde && this.color == other.color){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Figura 2D{\n" + this + "\n}";
    }
    
    public abstract int calcularArea();
    public abstract int calcularPerimetro();
}
