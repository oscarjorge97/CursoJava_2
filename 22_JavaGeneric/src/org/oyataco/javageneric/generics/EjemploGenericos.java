package org.oyataco.javageneric.generics;

import org.oyataco.javageneric.modelo.Cliente;
import org.oyataco.javageneric.modelo.ClientePremiun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List <Cliente>clientes=new ArrayList<>();
        clientes.add(new Cliente("Oscar","Yataco"));

        Cliente oscar=clientes.get(0);

        Cliente [] clientesArray={new Cliente("Luci","Martinez"),
                                  new Cliente("Oscar","Yataco")};

        Integer[] enterosArray={1,2,3};

        //esta va a ser la conversion del arreglo utilizando el metodo de fromArrayToList
        List <Cliente> clientesLista=fromArrayToList(clientesArray);
        List <Integer> enterosLista=fromArrayToList(enterosArray);

        clientesLista.forEach(System.out::println);
        System.out.println("=====   ======");
        enterosLista.forEach(System.out::println);

        System.out.println("::::::::::::::::::::::::");
        List <String> nombres=fromArrayToList(new String[]{"Oscar","Pepe","Lucia","Bea","Ernesto"},enterosArray);
        nombres.forEach(System.out::println);


        List <ClientePremiun> clientesPremiumList= fromArrayToList(new ClientePremiun[]{new ClientePremiun("Paco","Fernandez")});

        System.out.println("===COMODINES===");
        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);

        System.out.println("Maximo de 1 9 y 4 es: "+maximo(1,9,4));
        System.out.println("Maximo de 3,9 11,6 y 7,78 es: "+maximo(3.9,11.6,7.78));
        System.out.println("Maximo de zanahoria arándano y manzana es: "+maximo("zanahoria","arándano","manzana"));
    }





    //añadir <T> conteniendo List, para indicar que es un método genérico
    //así ya no solo podemos convertir Clientes, sino que a demás un array de numeros,enteros,String...
    //Aquí solo tendrá un solo parametro
    public static <T> List<T> fromArrayToList(T[] c){

        return Arrays.asList(c);//el metodo asList que recibe un arreglo y lo convierte en una List(a)
    }

    //Sobrecarga de metodos
    //Limitaremos este metodo generico a solo Numbers haciendo que la 'T' herede de la clase abstracta Number
    public static <T extends Number> List<T> fromArrayToList(T[] c){

        return Arrays.asList(c);//el metodo asList que recibe un arreglo y lo convierte en una List(a)
    }

    //Sobrecarga de metodos
    //Limitaremos este metodo generico a solo Clientes haciendo que la 'T' herede de la clase Cliente
    //Para ser más completo y limitar más diciendo que también implemente alguna interfaz
    public static <T extends Cliente & Comparable>List<T> fromArrayToList(T[] c){

        return Arrays.asList(c);//el metodo asList que recibe un arreglo y lo convierte en una List(a)
    }


    //Sobrecarga de metodo
    //Aquí tendrá dos parametros
    //La g en el parametro podría ser un arreglo o podría ser otra cosa
    public static <T,G> List<T> fromArrayToList(T[] c, G[] g){

        for(G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);//el metodo asList que recibe un arreglo y lo convierte en una List(a)
    }


    //Wildcarts/Comodines, solo son usables en listas y podremos pasar en parametros a los hijos de lo que seleccionemos
    //se hace añadiendo ?extends en el parametro
    public static void imprimirClientes(List<?extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }


    public static <T extends Comparable<T>> T maximo (T a ,T b ,T c){

        T max=a;    //max=a
        if (b.compareTo(max)>0){ //si b es mayor que max == b>0     max=b
            max=b;
        }
        if (c.compareTo(max)>0){ //si c es mayor que max == c>0     max=c
            max=c;
        }
        return max;
    }

}
