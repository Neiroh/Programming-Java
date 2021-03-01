/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author profesor
 */
public class Triangulo extends Forma{
    
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(){
        
    }
    
    public Triangulo(double base, double altura){
        super("Triangulo", 8);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "Nombre: " + getNombre() + "\n}\n\n";
    }

    
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    
    
    
    
}
