/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;
import Figura3D.Esfera;
import Figura3D.Cubo;
import Figura3D.Piramide;
import Figura2D.Cuadrado;
import Figura2D.Circulo;
import Figura2D.Triangulo;

/**
 *
 * @author Neiroh
 */
public class Main {

    public static void main(String[] args) {
        
        Cuadrado cuad = new Cuadrado("cuadrado", 2, 8, 2);
        Circulo circ = new Circulo("circulo", 2, 5, 2);
        Triangulo tri = new Triangulo("triangulo" ,2,3, 2, 2);
        
        Esfera esf = new Esfera("esfera", 3, 8, 2);
        Cubo cub = new Cubo("cubo", 3, 7, cuad);
        Piramide pir = new Piramide("piramide", 2, 2, tri, 2, 2, 2);
        
        System.out.println(cuad);
        System.out.println(circ);
        System.out.println(tri);
        System.out.println(esf);
        System.out.println(cub);
        System.out.println(pir);
    }
}
