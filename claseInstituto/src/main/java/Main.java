/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dir1 = new Direccion("dspfjsdf", 3, 4, "a", 51002);
        Direccion dir2 = new Direccion("dspfjsdf", 3, 4, "a", 51002);
        Direccion dir3 = new Direccion("dspfjsdf", 3, 4, "a", 51002);
        
        Direccion[] direcciones = new Direccion[3];
        direcciones[0] = dir1;
        direcciones[1] = dir2;
        direcciones[2] = dir3;
        
        Alumno a = new Alumno("RAUL", "FERNANDEZ", "ARCE", 19, 123456789, "123456789A", 9854, "ALUMNOA@GMAIL.COM", "JOSE", "LAURA", 123456789, 123456789, direcciones);
        Alumno b = new Alumno("ALVARO", "BAUTISTA", "ARCE", 25, 123456789, "133456789A", 9855, "ALUMNOB@GMAIL.COM", "JESUS", "LAURA", 123456789, 123456789, direcciones);
        
        if(a.equals(b)){
            System.out.println("EL DNI SE REPITE");
        }else{
            System.out.println(a.toString());
            System.out.println(b.toString());
        }
        
        Matricula mat1 = new Matricula(1, a, "DAW", "Diurno", true);
        Matricula mat2 = new Matricula(2, b, "DAM", "Diurno", true);
        
        if(mat1.equals(mat2)){
            System.out.println("LA MATRICULA ES LA MISMA");
        }else{
            System.out.println(mat1.toString());
            System.out.println(mat2.toString());
        }
    }
}
