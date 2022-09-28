package org.oyataco.ejemplo;

import org.oyataco.herencia.Alumno;
import org.oyataco.herencia.AlumnoInternacional;
import org.oyataco.herencia.Persona;
import org.oyataco.herencia.Profesor;

public class EjemploHerenciaSobrecargaToString {
    public static void main(String[] args) {
        Alumno alumno=new Alumno("Óscar","Yataco",24,"Instituo Nacional");
        alumno.setNotaCastellano(7.5);
        alumno.setNotaHistoria(5);
        alumno.setNotaMatematica(7);
        alumno.setEmail("oscar@gmail.com");



        AlumnoInternacional alumnoInter=new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInter.setEdad(15);
        alumnoInter.setInstituto("Instituto Nacional");
        alumnoInter.setNotaIdiomas(6.8);
        alumnoInter.setNotaCastellano(6.2);
        alumnoInter.setNotaHistoria(5.8);
        alumnoInter.setNotaMatematica(4.9);
        alumnoInter.setEmail("peter@gmail.com");


        Profesor profesor=new Profesor("Luci","Perez","Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("Luci@gmail.com");


        System.out.println("=============");
        imprimir(alumno);
        System.out.println("=============");
        imprimir(alumnoInter);
        System.out.println("=============");
        imprimir(profesor);


    }
    public static void imprimir(Persona persona){
        System.out.println(persona.toString());
    }
}
