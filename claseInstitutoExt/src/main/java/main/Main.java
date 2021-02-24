package main;




import biblioteca.Libro;
import biblioteca.Prestamo;
import gestionGrupos.Alumno;
import gestionGrupos.Departamento;
import gestionGrupos.Direccion;
import gestionGrupos.Estudio;
import gestionGrupos.Grupo;
import gestionGrupos.Materia;
import gestionGrupos.Matricula;
import gestionGrupos.Profesor;
import java.util.Date;
import secretaria.Peticion;
import secretaria.SolicitudBeca;



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

        Direccion[] direcciones = new Direccion[3];
        direcciones[0] = new Direccion("abc", 3, 4, "a", 51002);
        direcciones[1] = new Direccion("cba", 3, 4, "a", 51002);
        direcciones[2] = new Direccion("bac", 3, 4, "a", 51002);

        Alumno a = new Alumno("RAUL", "FERNANDEZ", "ARCE", 19, 123456789, "123456789A", 9854, "ALUMNOA@GMAIL.COM", "JOSE", "LAURA", 123456789, 123456789, direcciones);
        Alumno b = new Alumno("ALVARO", "BAUTISTA", "ARCE", 25, 123456789, "133456789A", 9855, "ALUMNOB@GMAIL.COM", "JESUS", "LAURA", 123456789, 123456789, direcciones);

        if (a.equals(b)) {
            System.out.println("EL DNI SE REPITE");
        } else {
//             System.out.println(a.toString());
//            System.out.println(b.toString());
//            System.out.println();
        }

        Materia[] materias = new Materia[6];
        materias[0] = new Materia(1, "Programación");
        materias[1] = new Materia(2, "SI");
        materias[2] = new Materia(3, "Entornos");
        materias[3] = new Materia(4, "BBDD");
        materias[4] = new Materia(5, "LMSGI");
        materias[5] = new Materia(7, "FOL");

//        System.out.println(mod1.toString());
//        System.out.println(mod2.toString());
//        System.out.println(mod3.toString());
//        System.out.println(mod4.toString());
//        System.out.println(mod5.toString());
//        System.out.println(mod6.toString());
//        System.out.println();
        Departamento dep1 = new Departamento(1, "Informática");
        Departamento dep2 = new Departamento(2, "Formación Laboral");

        if (dep1.equals(dep2)) {
            System.out.println("EL ID ES EL MISMO");
        } else {
//            System.out.println(dep1.toString());
//            System.out.println(dep2.toString());
//            System.out.println();
        }

        Estudio std1 = new Estudio(1, "Desarrollo de Aplicaciones Web", materias);
        Estudio std2 = new Estudio(2, "Desarrollo de Aplicaciones Multiplataforma", materias);

//        System.out.println(std1.toString());
        Matricula mat1 = new Matricula(1, a, std1, "Diurno", true);
        Matricula mat2 = new Matricula(2, b, std2, "Diurno", true);

        Matricula[] mat = new Matricula[2];
        mat[0] = mat1;
        mat[1] = mat2;

        if (mat1.equals(mat2)) {
            System.out.println("LA MATRICULA ES LA MISMA");
        } else {
//            System.out.println(mat1.toString());
//            System.out.println(mat2.toString());
//            System.out.println();
        }

        Profesor[] prof = new Profesor[6];
        prof[0] = new Profesor(1, "123456789A", "Javier", "De Reyes", "A", dep1);
        prof[1] = new Profesor(2, "133456789A", "José Óscar", "González", "B", dep1);
        prof[2] = new Profesor(3, "143456789A", "Rosendo", "C", "D", dep1);
        prof[3] = new Profesor(4, "153456789A", "Javier", "Castillo", "E", dep1);
        prof[4] = new Profesor(5, "163456789A", "Javier", "Criado", "F", dep1);
        prof[5] = new Profesor(6, "173456789A", "Maite", "Lagares", "G", dep2);

//        System.out.println(pr1.toString());
//        System.out.println(pr2.toString());
//        System.out.println(pr3.toString());
//        System.out.println(pr4.toString());
//        System.out.println(pr5.toString());
//        System.out.println(pr6.toString());
//        System.out.println();
        Grupo gr1 = new Grupo(1, "DAW1", std1, "Diurno", 1, prof[1], mat, prof);
        
        Date date1 = new Date();
        Date date2 = new Date(2020, 12, 13);
        
        Peticion pe1 = new Peticion(1, date1, true, prof[3]);
        Peticion pe2 = new Peticion(2, date2, false, prof[5]);
        
        System.out.println(pe1.toString());
        System.out.println(pe2.toString());
        System.out.println();
        
        Date date3 = new Date(2021, 02, 10);
        Date date4 = new Date(2021, 01, 27);
        Date date5 = new Date(2021, 01, 23);
        Date date6 = new Date(2021, 02, 04);
        
        Libro lb1 = new Libro(123456, "El Temor de un Hombre Sabio", "Patrick Rothfus", 972, "DeBolsillo", 6);
        Libro lb2 = new Libro(213456, "El Sonido del Silencio", "Patrick Rothfus", 467, "DeBolsillo", 3);
        
        Prestamo pr1 = new Prestamo(lb1, a, date4, date3);
        Prestamo pr2 = new Prestamo(lb2, b, date5, date6);
        
        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println();
        
        Date fnac1 = new Date(2001, 07, 13);
        Date fnac2 = new Date(1995, 07, 20);
        
        SolicitudBeca sb1 = new SolicitudBeca(1, "Raúl", "Fernández", "Arce", "ES1234567890", "Solito", fnac1, true);
        SolicitudBeca sb2 = new SolicitudBeca(2, "Álvaro", "Bautista", "Arce", "ES1234567899", "Casao", fnac2, false);
        
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
    }

}
