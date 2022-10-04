package org.oyataco.interfaces.repositorio;

import org.oyataco.interfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    //Methods
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
