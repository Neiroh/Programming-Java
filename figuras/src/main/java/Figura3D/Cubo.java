/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figura3D;
import Figura2D.Cuadrado;
/**
 *
 * @author Neiroh
 */
public class Cubo extends Figura3D{

    //Atributos
    Cuadrado cuad;
    
    public Cubo(){
        
    }
    
    public Cubo(String nombre, int grosorBorde, int color, Cuadrado cuad){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
        this.cuad = cuad;
    }
    
    public boolean equals(Cubo other){
        if(cuad == other.cuad && nombre.equals(other.nombre) && grosorBorde == other.grosorBorde && color == other.color){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void dibujar(){
        
    }
    
    public int calcularVolumen(){
        final int volumen = (int) Math.pow(cuad.getLado(), 3);
        return volumen;
    }
    
    @Override
    public String toString(){
        return "Cubo{\n" + this + "\n";
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
