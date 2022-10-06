package org.oyataco.javageneric.repositorio;

import org.oyataco.javageneric.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    //Methods
    List<Cliente> listar(int desde, int hasta);

}
