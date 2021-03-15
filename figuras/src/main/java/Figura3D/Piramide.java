/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figura3D;
import Figura2D.Triangulo;

/**
 *
 * @author Neiroh
 */
public class Piramide extends Figura3D{

    //Atributos
    Triangulo tri;
    int altura;
    int base1;
    int base2;
    
    public Piramide(){
        
    }
    
    public Piramide(String nombre, int grosorBorde, int color, Triangulo tri, int altura, int base1, int base2){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
        this.tri = tri;
        this.altura = altura;
        this.base1 = base1;
        this.base2 = base2;
    }
    
    public boolean equals(Piramide other){
        if(altura == other.altura && base1 == other.base1 && base2 == other.base2 && tri == other.tri && nombre.equals(other.nombre) && grosorBorde == other.grosorBorde && color == other.color){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Piramide{\nTriángulo: " + tri + this + "\n}";
    }
    
    @Override
    public void dibujar(){
        
    }
    
    public int calcularVolumen(){
        return (1/3)*(base1*base2)*altura;
    }

    public Triangulo getTri() {
        return tri;
    }

    public void setTri(Triangulo tri) {
        this.tri = tri;
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
