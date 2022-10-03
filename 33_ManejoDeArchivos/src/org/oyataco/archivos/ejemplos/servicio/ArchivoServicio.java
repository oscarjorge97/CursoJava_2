package org.oyataco.archivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    //Con el bufferedWriter
    public void crearArchivo(String nombre){
        File archivo=new File(nombre); //La clase file representa un archivo, que contiene su direccion

        try (BufferedWriter bufferWriter=new BufferedWriter(new FileWriter(archivo,true))){//La clase FileWrtiter crea el archivo en la direccion que
            // se le pasa en el parametro. Si el archivo existe, y le añadimos el parametro 'true' entonces guardará el contenido y añadirá más

            bufferWriter.append("\n").append("Hey que tal amigos!\n").append("Todo bien? yo estaba escribiendo un archivo...\n")
                    .append("Hasta luego Lucas").append("\n");
            //bufferWriter.close(); el close es necesario si invocamos el Buffer fuera del try
            System.out.println("El archivo se ha creado con exito");
        }catch (IOException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }
    //Con el printWriter
    public void crearArchivo2(String nombre){
        File archivo=new File(nombre); //La clase file representa un archivo, que contiene su direccion

        try (PrintWriter print=new PrintWriter(new FileWriter(archivo,true))){//La clase FileWrtiter crea el archivo en la direccion que
            // se le pasa en el parametro. Si el archivo existe, y le añadimos el parametro 'true' entonces guardará el contenido y añadirá más

            print.println("Hey que tal amigos!");
            print.println("Todo bien? yo estaba escribiendo un archivo...");
            print.printf("Hasta luego %s!","Lucas");
            //bufferWriter.close(); el close es necesario si invocamos el Buffer fuera del try
            System.out.println("El archivo se ha creado con exito");
        }catch (IOException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }

    //Leer
    public String leerArchivo(String nombre){
        StringBuilder sb=new StringBuilder();
        File archivo=new File(nombre);


        try(BufferedReader bufferR=new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea=bufferR.readLine())!=null){

                sb.append(linea).append("\n");
            }

        }catch (IOException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return sb.toString();
    }

    //metodo scanner
    public String leerArchivo2(String nombre){
        StringBuilder sb=new StringBuilder();
        File archivo=new File(nombre);


        try(Scanner sc=new Scanner(archivo)){


            while (sc.hasNext()){
            sc.useDelimiter("\n");
                sb.append(sc.next()).append("\n");
            }

        }catch (IOException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return sb.toString();
    }
}
