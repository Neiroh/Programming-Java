
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class columnaArrayBiInt {
    
    /*Este programa, mediante una función, devuelve la columna de un array bidimensional*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("inserta el número de filas..");
        int filas = sc.nextInt();
        
        System.out.println("Inserta el número de columnas..");
        int col = sc.nextInt();
        
        int[][] arrayBi = new int[filas][col];
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < col; j++){
                System.out.println("Inserta un valor del array..");
                arrayBi[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Inserta la columna que quieres conocer..");
        int quiere = sc.nextInt();
        
        System.out.println("La columna..");
        encuentraColumna(arrayBi, filas, col, quiere);
    }
    
    public static void encuentraColumna(int[][] array, int fil, int col, int quiere){
        
        for(int i = 0; i < fil; i++){
            System.out.print(array[i][quiere - 1] + "  ");
        }
    }
}
