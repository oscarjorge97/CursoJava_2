package org.oyataco.javageneric.repositorio;

import org.oyataco.javageneric.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements FullRepositorio{

    private List<Cliente> dataSource;    //este va a ser el contenedor de los datos y donde vamos a realizar las operaciones



    //Constructor


    public ClienteListRepositorio() {
        this.dataSource=new ArrayList<>();
    }

    //Methods interface
    @Override//CrudRepositorio
    public List<Cliente> listar() {
        return this.dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente cliente=null;
        //tenemos que buscar cliente por cliente para saber si coincide con este id
        for (Cliente c:dataSource){
            if ( (c.getId().equals(id)) && (c.getId()!=null) ){
                cliente=c;
                break;
            }
        }

        return cliente;

    }

    @Override
    public void crear(Cliente cliente){
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c=this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c=this.porId(id);
        this.dataSource.remove(c);
    }

    @Override//OrdenableRepositorio
    public List<Cliente> listar (String campo, Direccion direccion) {
        //Hay dos formas de hacerlo:

        //Clase anonima
        this.dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {

                int resultado=0;

                if (direccion==Direccion.ASC){
                    switch (campo){
                        case "id"-> resultado=o1.getId().compareTo(o2.getId());
                        case "nombre"-> resultado=o1.getNombre().compareTo(o2.getNombre());
                        case "apellido"-> resultado=o1.getApellido().compareTo(o2.getApellido());
                    }
                } else if (direccion==Direccion.DESC) {

                    switch (campo){

                        case "id"-> resultado=o2.getId().compareTo(o1.getId());
                        case "nombre"-> resultado=o2.getNombre().compareTo(o1.getNombre());
                        case "apellido"-> resultado=o2.getApellido().compareTo(o1.getApellido());

                    }
                }
                return resultado;
            }
        });


        //Lambda
       /* this.dataSource.sort((Cliente o1, Cliente o2)-> {   //clase anonima
                int resultado=0;
                if (direccion==Direccion.ASC){
                    switch (campo){

                        case "id"-> resultado=o1.getId().compareTo(o2.getId());
                        case "nombre"-> resultado=o1.getNombre().compareTo(o2.getNombre());
                        case "apellido"-> resultado=o1.getApellido().compareTo(o2.getApellido());

                    }
                } else if (direccion==Direccion.DESC) {

                    switch (campo){

                        case "id"-> resultado=o2.getId().compareTo(o1.getId());
                        case "nombre"-> resultado=o2.getNombre().compareTo(o1.getNombre());
                        case "apellido"-> resultado=o2.getApellido().compareTo(o1.getApellido());

                    }
                }
                return resultado;
        });*/
        return dataSource;
    }


    /**
     * Este metodo nos sirve para listar entre tal ID y tal ID
     * @param desde
     * @param hasta
     * @return dataSource.subList (int index,int index)
     */
    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    @Override
    public int count() {
        return this.dataSource.size();
    }
}
