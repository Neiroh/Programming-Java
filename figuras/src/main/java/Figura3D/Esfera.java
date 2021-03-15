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
    
    public Esfera(String nombre, int grosorBorde, int color, int radio){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
        this.radio = radio;
    }

    public boolean equals(Esfera other){
        if(nombre.equals(other.nombre) && grosorBorde == other.grosorBorde && color == other.color && radio == other.radio){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Esfera{\n" + this + "Radio: " + radio + "\n}";
    }
    
    @Override
    public void dibujar(){
        
    }
    
    public int calcularVolumen(){
        final int volumen = (int) ((int) (4/3)*Math.PI*radio*radio*radio);
        return volumen;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getGrosorBorde() {
        return grosorBorde;
    }

    @Override
    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }
    
    
}
