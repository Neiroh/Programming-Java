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
        Direccion dir1 = new Direccion("abc", 3, 4, "a", 51002);
        Direccion dir2 = new Direccion("cba", 3, 4, "a", 51002);
        Direccion dir3 = new Direccion("bac", 3, 4, "a", 51002);
        
        Direccion[] direcciones = new Direccion[3];
        direcciones[0] = dir1;
        direcciones[1] = dir2;
        direcciones[2] = dir3;
        
        Alumno a = new Alumno("RAUL", "FERNANDEZ", "ARCE", 19, 123456789, "123456789A", 9854, "ALUMNOA@GMAIL.COM", "JOSE", "LAURA", 123456789, 123456789, direcciones);
        Alumno b = new Alumno("ALVARO", "BAUTISTA", "ARCE", 25, 123456789, "133456789A", 9855, "ALUMNOB@GMAIL.COM", "JESUS", "LAURA", 123456789, 123456789, direcciones);
        
        if(a.equals(b)){
            System.out.println("EL DNI SE REPITE");
        }else{
//            System.out.println(a.toString());
//            System.out.println(b.toString());
//            System.out.println();
        }
        
        Matricula mat1 = new Matricula(1, a, "DAW", "Diurno", true);
        Matricula mat2 = new Matricula(2, b, "DAM", "Diurno", true);
        
        Matricula[] mat = new Matricula[2];
        mat[0] = mat1;
        mat[1] = mat2;
        
        if(mat1.equals(mat2)){
            System.out.println("LA MATRICULA ES LA MISMA");
        }else{
//            System.out.println(mat1.toString());
//            System.out.println(mat2.toString());
//            System.out.println();
        }
        
        Materia mod1 = new Materia(1, "Programación");
        Materia mod2 = new Materia(2, "SI");
        Materia mod3 = new Materia(3, "Entornos");
        Materia mod4 = new Materia(4, "BBDD");
        Materia mod5 = new Materia(5, "LMSGI");
        Materia mod6 = new Materia(7, "FOL");
        
        Materia[] materias = new Materia[6];
        materias[0] = mod1;
        materias[1] = mod2;
        materias[2] = mod3;
        materias[3] = mod4;
        materias[4] = mod5;
        materias[5] = mod6;
        
//        System.out.println(mod1.toString());
//        System.out.println(mod2.toString());
//        System.out.println(mod3.toString());
//        System.out.println(mod4.toString());
//        System.out.println(mod5.toString());
//        System.out.println(mod6.toString());
//        System.out.println();
        
        
        Departamento dep1 = new Departamento(1, "Informática");
        Departamento dep2 = new Departamento(2, "Formación Laboral");
        
        if(dep1.equals(dep2)){
            System.out.println("EL ID ES EL MISMO");
        }else{
//            System.out.println(dep1.toString());
//            System.out.println(dep2.toString());
//            System.out.println();
        }
        
        Estudio std1 = new Estudio(1, "Desarrollo de Aplicaciones Web", materias);
        Estudio std2 = new Estudio(2, "Desarrollo de Aplicaciones Multiplataforma", materias);
        
//        System.out.println(std1.toString());
        
        Profesor pr1 = new Profesor(1, "123456789A", "Javier", "De Reyes", "A", dep1);
        Profesor pr2 = new Profesor(2, "133456789A", "José Óscar", "González", "B", dep1);
        Profesor pr3 = new Profesor(3, "143456789A", "Rosendo", "C", "D", dep1);
        Profesor pr4 = new Profesor(4, "153456789A", "Javier", "Castillo", "E", dep1);
        Profesor pr5 = new Profesor(5, "163456789A", "Javier", "Criado", "F", dep1);
        Profesor pr6 = new Profesor(6, "173456789A", "Maite", "Lagares", "G", dep2);
        
        Profesor[] prof = new Profesor[6];
        prof[0] = pr1;
        prof[1] = pr2;
        prof[2] = pr3;
        prof[3] = pr4;
        prof[4] = pr5;
        prof[5] = pr6;
        
//        System.out.println(pr1.toString());
//        System.out.println(pr2.toString());
//        System.out.println(pr3.toString());
//        System.out.println(pr4.toString());
//        System.out.println(pr5.toString());
//        System.out.println(pr6.toString());
//        System.out.println();
        
        Grupo gr1 = new Grupo(1, "DAW1", std1, "Diurno", 1, prof[1], mat, prof);
        mostrar(gr1);
        
    }
    
    public static void mostrar(Grupo gr){
        System.out.println(gr.toString());
    }
}
