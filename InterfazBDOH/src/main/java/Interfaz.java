/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
import java.util.Scanner;

public class Interfaz {
    
    //Este programa muestra una interfaz para convertir decimales, binarios, octales, y hexadecimales
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;
        
        do {
            System.out.println("Elige qué función quieres");
            System.out.println("1.- Binario - Decimal");
            System.out.println("2.- Octal - Decimal");
            //System.out.println("3.- Hexadecimal - Decimal");
            System.out.println("4.- Decimal - Binario");
            System.out.println("5.- Decimal - Octal");
            //System.out.println("6.- Decimal - Hexadecimal");
            System.out.println("7.- Salir");
            op = sc.nextInt();
            
            if(op < 1 && op > 7){
                System.out.println("OPCIÓN INCORRECTA");
                op = sc.nextInt();
            }else if(op == 1){
                System.out.println("ingresa un número Binario");
                int num = sc.nextInt();
                System.out.println("El resultado es.. " + convierteBinDec(num));
            }else if(op == 2){
                System.out.println("ingresa un número Octal");
                int num = sc.nextInt();
                System.out.println("El resultado es.. " + convierteOctDec(num));
            }/*else if(op == 3){
                System.out.println("ingresa un número Hexadecimal");
                int num = sc.nextInt();
                System.out.println("El resultado es.. " + convierteHexDec(num));
            }*/else if(op == 4){
                System.out.println("ingresa un número Decimal");
                int num = sc.nextInt();
                System.out.println("El resultado es.. " + convierteDecBin(num));
            }else if(op == 5){
                System.out.println("ingresa un número Decimal");
                int num = sc.nextInt();
                System.out.println("El resultado es.. " + convierteDecOct(num));
            }/*else if(op == 6){
                System.out.println("ingresa un número Decimal");
                int num = sc.nextInt();
                System.out.println("El resultado es.. " + convierteDecHex(num));
            }*/
            
        } while (op != 7);
    }
    
    public static int convierteDecBin(int num){
        
        //Declara variables
        double binario = 0;
        int digito = 0;
        int pos = 0;
        
        while(num!=0){
                digito = num % 2;           
                binario += digito * Math.pow(10, pos);                                                   
                pos++;
                num = num/2;
        }
        return (int) binario;
    }
    
    public static int convierteOctDec(int num){
        
        int digito = 0;
        int decimal = 0;
        int finaliza = num;
        int pos = 0;
        
        while (finaliza != 0){
            digito = finaliza % 10;
            decimal += digito*Math.pow(8, pos);
            finaliza /= 10;
            pos ++;
        } 
        
        return decimal;
    }
    
    public static int convierteBinDec(int num){
        
        int digito = 0;
        int decimal = 0;
        int finaliza = num;
        int pos = 0;
        
        while (finaliza != 0){
            digito = finaliza % 10;
            decimal += digito*Math.pow(2, pos);
            finaliza /= 10;
            pos ++;
        } 
        
        return decimal;
    }
    
    public static int convierteHexDec(int num){
        
        int digito = 0;
        int hexa = 0;
        int finaliza = num;
        int pos = 0;
        
        while (finaliza != 0){
            digito = finaliza % 10;
            hexa += digito*Math.pow(16, pos);
            finaliza /= 10;
            pos ++;
        } 
        
        return hexa;
    }
    
    public static int convierteDecOct(int num){
        
        //Declara variables
        double binario = 0;
        int digito = 0;
        int pos = 0;
        
        while(num!=0){
                digito = num % 8;           
                binario += digito * Math.pow(10, pos);                                                   
                pos++;
                num = num/8;
        }
        return (int) binario;
    }
    
    public static int convierteDecHex(int num){
        
        //Declara variables
        double hex = 0;
        int digito = 0;
        int pos = 0;
        
        while(num!=0){
                digito = num % 16;           
                hex += digito * Math.pow(10, pos);                                                   
                pos++;
                num = num/16;
        }
        return (int) hex;
    }
}
