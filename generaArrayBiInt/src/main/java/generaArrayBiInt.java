/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
import java.util.Arrays;
import java.util.Scanner;

public class generaArrayBiInt {
    
    /*Este programa, mediante una función,crea un array de int bidimensional*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta el número de columnas del array..");
        int col = sc.nextInt();
        
        System.out.println("Inserta el número de filas del array..");
        int fil = sc.nextInt();
        
        int[][] array = new int[fil][col];
        
        System.out.println("El array resultante es.. ");
        generaArrayBi(array, fil, col);
    }
    
    public static void generaArrayBi(int[][] array, int fil, int col){
        
        for(int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = (int) Math.floor(Math.random()*99);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        
    }
}
