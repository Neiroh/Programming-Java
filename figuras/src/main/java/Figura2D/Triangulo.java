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
public class Triangulo extends Figura2D{

    //Atributos
    int base;
    int altura;
    
    public Triangulo(){
        
    }
    
    public Triangulo(String nombre, int grosorBorde, int color, int base, int altura){
        this.nombre = nombre;
        this.grosorBorde = grosorBorde;
        this.color = color;
        this.base = base;
        this.altura = altura;
    }
    
    public boolean equals(Triangulo other){
        if(altura == other.altura && base == other.base && nombre.equals(other.nombre) && grosorBorde == other.grosorBorde && color == other.color){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Triángulo{\nBase: " + base + "\nAltura: " + altura + "\n" + this + "\n}";
    }
    
    @Override
    public void dibujar(){
        
    }
    
    public int calcularArea(){
        return (base*altura)/2;
    }
    
    public int cambiarTamañoBase(int base){
        this.base = base;
        
        return base;
    }
    
    public int cambiarTamañoAltura(int altura){
        this.altura = altura;
        
        return altura;
    }
    
    public int calcularPerimetro(){
        return 0;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
