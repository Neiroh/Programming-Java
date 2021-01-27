/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */
import java.util.Random;
public class arrayPosicionNo {
    
    public static void main(String[] args) {
        
        int array[][] = new int[6][10];
        
        /*En esta variable almacen vamos a almacenar el valor del array que estemos recorriendo en
        ese momento para compararlo más tarde*/
        
        int almacenMayor = 0;
        int almacenMenor = 1000;
        
        int repite;
        
        /*d1 es la dimensión primera del array, y la celda es el cuadrado correspondiente
        que encontramos dentro del array, ya que al ser bidimensional, estamos conteniendo
        un array dentro de otro*/
        
        /*El símbolo ":" hace que en el "for", en la variable dada, en este caso d1, se almacene
        el valor de la primera dimensión del array*/
        
        /*En el segundo "for", le damos a la celda, cada valor que va recorriendo d1*/
        
        /*
        for(int[] d1 : array){
            for(int celda : d1){
                array[0][celda] = (int) Math.floor(Math.random()*1000 + 0);
                System.out.println("rand num " + d1[celda]);
            }
        }
        */
        
        
        
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                array[i][j] = (int) Math.floor(Math.random()*1000 + 0);
                repite = array[i][j];
                for(int k = 0; k < 6; k++){
                    for(int l = 0; l < 10; l++) {
                        while(repite == array[k][l]){
                            array[k][l] = (int) Math.floor(Math.random()*1000);
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                
                //Quitar los comentarios de la linea de abajo para ver todos los valores del array
                System.out.println(array[i][j]);
                if(almacenMayor < array[i][j]){
                    almacenMayor = array[i][j];
                }
                if(almacenMenor > array[i][j]){
                    almacenMenor = array[i][j];
                }
            }
        }
        
        System.out.println("El número mayor del array es..  " + almacenMayor);
        System.out.println("El número menor del array es..  " + almacenMenor);
    }
}