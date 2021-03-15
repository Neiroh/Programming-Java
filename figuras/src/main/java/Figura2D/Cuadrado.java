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
public class Cuadrado extends Figura2D{

    //Atributos
    int lado;
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(String nombre, int grosorBorde, int color, int lado){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
        this.lado = lado;
    }
    
    public boolean equals(Cuadrado other){
        if(lado == other.lado && nombre.equals(other.nombre) && grosorBorde == other.grosorBorde && color == other.color){
            return true;
        }else{
            return false;
        }
    }
    
    public int calcularArea(){
        return lado*lado;
    }
    
    public int calcularPerimetro(){
        final int perimetro = lado*4;
        return perimetro;
    }
    
    public int cambiarTamaño(int nuevoLado){
        this.lado = nuevoLado;
        return lado;
    }
    
    @Override
    public void dibujar(){
        
    }

    @Override
    public String toString() {
        return "Cuadrado{\nlado:" + lado + "\n" + this + "\n}";
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
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