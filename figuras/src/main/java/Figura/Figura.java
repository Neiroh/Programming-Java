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
    protected String nombre;
    protected int grosorBorde;
    protected int color;
    
    public Figura(){
        
    }
    
    public Figura(String nombre, int grosorBorde, int color){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
    }
    
    public abstract void dibujar();
    
    public boolean equals(Figura other){
        if(nombre == other.getNombre() && grosorBorde == other.getGrosorBorde() && color == other.getColor()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Figura{\nnombre = " + nombre + "\nGrosor del Borde = " + grosorBorde + "\nColor = " + color + "\n}";
    }
    
    //GETTERS & SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setGrosorBorde(int grosorBorde){
        this.grosorBorde = grosorBorde;
    }
    
    public int getGrosorBorde(){
        return grosorBorde;
    }
    
    public void setColor(int color){
        this.color = color;
    }
    
    public int getColor(){
        return color;
    }
}
