package org.oyataco.ejemplo;

import org.oyataco.herencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno=new Alumno();
        alumno.setNombre("Óscar");
        alumno.setApellido("Yataco");
        alumno.setInstituto("Instituto Nacional");
        alumno.setNotaCastellano(7.5);
        alumno.setNotaHistoria(5);
        alumno.setNotaMatematica(7);



        AlumnoInternacional alumnoInter=new AlumnoInternacional();
        alumnoInter.setNombre("Peter");
        alumnoInter.setApellido("Gosling");
        alumnoInter.setPais("Australia");
        alumnoInter.setEdad(15);
        alumnoInter.setInstituto("Instituto Nacional");
        alumnoInter.setNotaIdiomas(6.8);
        alumnoInter.setNotaCastellano(6.2);
        alumnoInter.setNotaHistoria(5.8);
        alumnoInter.setNotaMatematica(4.9);



        Profesor profesor=new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre()+" "+alumno.getApellido()+" "+ alumno.getInstituto());
        System.out.println(alumnoInter.getNombre()+" "+alumnoInter.getApellido()+" "+alumnoInter.getInstituto()+" "+alumnoInter.getPais());
        System.out.println(profesor.getNombre()+" "+profesor.getApellido());
        System.out.println("Profesor de: "+ profesor.getAsignatura());


        Class clase=alumnoInter.getClass(); //adjuntamos al objeto 'clase' creado de la clase 'Class' la Clase completa del objeto 'alumnoInter' que p de la Clase 'AlumnoInternacionarovienel'

        while (clase.getSuperclass()!=null){ //mientras la clase padre sea distinta de null
            String hija=clase.getName();//añadimos a 'hija' el nombre de la Clase de 'clase'
            String padre=clase.getSuperclass().getName();//añadimos a 'padre' el nombre de la Clase Padre de 'clase'
            System.out.println(hija+" es una clase hija de la clase padre "+padre);
            clase=clase.getSuperclass();//el valor de 'clase' lo cambiamos al final de este bucle por el de la Clase Padre, para que empiece de nuevo pero con la Clase Padre de referencia
        }
    }
}
