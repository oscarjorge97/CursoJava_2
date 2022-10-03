package org.oyataco.archivos.ejemplos;

import org.oyataco.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        ArchivoServicio servicio=new ArchivoServicio();
        String ruta="C:\\WkSpaceVerano\\wkUdemy\\ArchivosDePrueba\\PrimerArchivoPrueba.txt";

        System.out.println(servicio.leerArchivo(ruta));
        System.out.println("________________");

        System.out.println(servicio.leerArchivo2(ruta));
    }
}
