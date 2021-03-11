/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figura3D;

import Figura.Figura;

/**
 *
 * @author Neiroh
 */
public abstract class Figura3D extends Figura{

    //Atributos
    
    public Figura3D(){

    }
    
    public Figura3D(String nombre, int grosorBorde, int color){
        this.nombre = nombre;
        this.color = color;
        this.grosorBorde = grosorBorde;
    }
    
    public abstract int calcularVolumen();
    
    public boolean equals(Figura3D other){
        if(this.color == other.color && this.nombre.equals(other.nombre) && this.grosorBorde == other.grosorBorde){
            return true;
        }else{
            return false;
        }
    }   
    
    @Override
    public String toString(){
        return "Figura3D{\n " + this + "\n}";
    }
}
