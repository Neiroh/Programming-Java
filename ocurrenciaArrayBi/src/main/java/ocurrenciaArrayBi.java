/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiroh
 */
import java.util.Arrays;
import java.util.Scanner;

public class ocurrenciaArrayBi {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserta el número de filas..");
        int fil = sc.nextInt();

        System.out.println("inserta el número de columnas..");
        int col = sc.nextInt();
        
        int[][] array = new int[fil][col];
        
        for(int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                System.out.println("Ingresa un numero..");
                array[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Inserta el número del que quieres sacar las coordenadas..");
        int num = sc.nextInt();
        

        System.out.println("Las coordenadas son.. " + encuentraOcurrencia(array, fil, col, num));
    }
    
    //Esta función se encarga de encontrar la primera ocurrencia de un número
    //@param num es el número que queremos encontrar
    //@param fil es el numero de filas del array
    //@param col es el número de columnas del array
    //@param array es el array en el que almacenamos los números
    public static String encuentraOcurrencia(int[][] array, int fil, int col, int num){
        
        int posX = -1;
        int posY = -1;
        
        for(int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                if(num == array[i][j]){
                    posX = i + 1;
                    break;
                }
            }
        }
        
        for(int i = 0; i < col; i++){
            for(int j = 0; j < fil; j++){
                if(num == array[i][j]){
                    posY = i + 1;
                    break;
                }
            }
        }
        
        int[] coord = new int[]{posX, posY}; 
        
        return Arrays.toString(coord);
    }
}
