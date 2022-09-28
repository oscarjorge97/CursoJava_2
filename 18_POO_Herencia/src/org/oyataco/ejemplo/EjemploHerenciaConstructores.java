package org.oyataco.ejemplo;

import org.oyataco.herencia.*;

import java.sql.SQLOutput;

public class EjemploHerenciaConstructores {
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
        System.out.println("nombre: "+persona.getNombre()+
                            ",apellido: "+persona.getApellido()+
                            ",edad: "+ persona.getEdad()+
                            ",email: "+persona.getEmail());
        if(persona instanceof Alumno){  //si persona es una instancia de alumno permitirá hacer el casteo
            System.out.println("Institucion: "+((Alumno) persona).getInstituto());
            System.out.println("Nota Matematicas: "+((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Castellano: "+((Alumno) persona).getNotaCastellano());
            System.out.println("Nota Historia: "+((Alumno) persona).getNotaHistoria());

            if (persona instanceof AlumnoInternacional){//se podría poner dentro del if de arriba, ya que AlumnoInternacional es hijo de Alumno
                System.out.println("Nota idiomas: "+((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());
            }

            System.out.println("Promedio de Notas: "+((Alumno) persona).calcularPromedio());

            if (persona instanceof Profesor){
                System.out.println("Asignatura: "+((Profesor) persona).getAsignatura());
            }
        }


        System.out.println("======SOBRE ESCRITURA=======");
        System.out.println(persona.saludar());


    }
}
