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

public class arrayExcelRandom {
    
    /*
    *   Este programa crea una table de 4*3 generada por números aleatorios
    */
    public static void main(String[] args) {
                
        int matriz[][] = new int[4][5];
        int acumuladorC = 0;
        int acumuladorF = 0;
        int total = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) Math.floor(Math.random()*999 + 100);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " +matriz[i][j]+ " ");
                acumuladorF += matriz[i][j];
                total += matriz[i][j];
            }
            System.out.println("   " +acumuladorF);
            acumuladorF = 0;
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                acumuladorC += matriz[j][i];
            }
            System.out.print(" " + acumuladorC + " ");
            acumuladorC = 0;
        }
        System.out.println("  " + total);
    }
}
        
        