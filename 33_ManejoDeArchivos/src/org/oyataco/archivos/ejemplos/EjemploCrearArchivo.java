package org.oyataco.archivos.ejemplos;

import org.oyataco.archivos.ejemplos.servicio.ArchivoServicio;

import java.io.BufferedReader;
import java.io.File;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo="C:\\WkSpaceVerano\\wkUdemy\\ArchivosDePrueba\\PrimerArchivoPrueba.txt";



        ArchivoServicio servicio=new ArchivoServicio();
        servicio.crearArchivo(nombreArchivo);
    }


}
