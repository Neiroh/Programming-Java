/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figura3D;

/**
 *
 * @author Neiroh
 */
public class Esfera extends Figura3D{

    //Atributos
    int radio;
    
    public Esfera(){
        
    }
    
    public Esfera(String nombre, int grosorBorde, int color){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }

    public boolean equals(Esfera other){
        if(this.nombre.equals(other.nombre) && this.grosorBorde == other.grosorBorde && this.color == other.color && this.radio == other.radio){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Esfera{\n" + this + "Radio: " + radio + "\n}";
    }
}
