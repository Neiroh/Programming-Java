/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figura2D;

/**
 *
 * @author Neiroh
 */
public class Circulo extends Figura2D{

    //Atributos
    int radio;
    
    public Circulo(){
        
    }
    
    public Circulo(String nombre, int grosorBorde, int color, int radio){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
        this.radio = radio;
    }
    
    public boolean equals(Circulo other){
        if(radio == other.radio && nombre.equals(other.nombre) && grosorBorde == other.grosorBorde && color == other.color){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Circulo{\nradio: " + radio + this + "\n}";
    }
    
    @Override
    public void dibujar(){
        
    }
    
    public int calcularArea(){
        return (int) (Math.PI*radio*radio);
    }
    
    public int calcularPerimetro(){
        return (int) Math.PI*(radio*2);
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
