package org.oyataco.interfaces.repositorio;

import org.oyataco.interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    //Methods
    //Aquí hay sobrecarga de metodos,este metodo listar ya estaba en el otro interface, pero lo que cambia son los parametros
    List<Cliente> listar(String campo,Direccion direccion);
}
