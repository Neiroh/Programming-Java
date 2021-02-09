/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiroh
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el número de filas");
        int fil = sc.nextInt();

        System.out.println("inserta el número de columnas");
        int col = sc.nextInt();
        
        int[][] array = new int[fil][col];
        
        for(int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                System.out.println("Ingresa un numero que quieres comprobar si es punto de silla");
                array[i][j] = sc.nextInt();
            }
        }   

        
        System.out.println("Inserta el número");
        int num = sc.nextInt();

        if(puntoDeSilla(array, fil, col, num) == true){
            System.out.println("Es punto de silla");
        }else{
            System.out.println("No es punto de silla");
        }
    }

    public static boolean puntoDeSilla(int[][] array, int fil, int col, int punto) {

        boolean menorFila = false;
        boolean mayorCol = false;

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (punto < array[i][j]) {
                    menorFila = true;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(punto > array[i][j]){
                    mayorCol = true;
                }
            }
        }
        
        return menorFila && mayorCol;

    }
}
