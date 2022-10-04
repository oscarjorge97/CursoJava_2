package org.oyataco.interfaces;

import org.oyataco.interfaces.modelo.Cliente;
import org.oyataco.interfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        //Podemos utilizar la interfaz más generica implementada a la clase que queremos instanciar
        //esta es la implementacion como un DAO(data access object),con las operaciones basicas a nuestros repositorios
        System.out.println("===== Crear =====");
        FullRepositorio repo=new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Perez"));
        repo.crear(new Cliente("Bea","Gonzalez"));
        repo.crear(new Cliente("Luci","Martinez"));
        repo.crear(new Cliente("Oscar","Yataco"));


        //Esta lista mostrará todos los clientes creados
        List<Cliente> clientes= repo.listar(); //listamos los clientes guardamos en la variable List 'clientes' creada

        clientes.forEach(System.out::println); //es la forma abreviada del foreach con expresion lambda: clientes.forEach(c->System.out::println(c));


        System.out.println("===== Paginable =====");
        //Si queremos paginar, es decir un subconjunto de estos elementos
        //ya que queremos listar de la  interfaz PaginableRepositorio haremos lo siguiente
        //haremos un cast hacia la interfaz que queremos y tendremos en cuenta la posicion de LOS parentesis
        List<Cliente> paginable=repo.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("===== Ordenar =====");
        //Queremos ordenar, usando la interfaz OrdenableRepositorio
        //Haremos un cast hacia la interfaz que queremos y tendremos en cuenta la posicion de LOS parentesis
        List <Cliente> ordenar=repo.listar("nombre", Direccion.ASC);

        ordenar.forEach(System.out::println);


        System.out.println("===== Actualizar/Editar =====");

        //creamos el nuevo usuario con su nombre y apellido
        //y le damos el id del que sustituirá
        //llamamos al metodo editar para que edita hacia el nuevo cliente que creamos
        Cliente beaActualizar=new Cliente("Bea","Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        //mostramos el id2
        Cliente bea=repo.porId(2);
        System.out.println(bea);

        //Eliminamos un id que borraría (todoo de ese id)
        System.out.println("===== Borrar =====");

        repo.eliminar(1);
        //mostramos toda la lista
        repo.listar().forEach(System.out::println);

        //Contaremos la cantidad de registros/Clientes tenemos
        System.out.println("===== Count =====");
        System.out.println("Total registros: "+repo.count());


    }
}
