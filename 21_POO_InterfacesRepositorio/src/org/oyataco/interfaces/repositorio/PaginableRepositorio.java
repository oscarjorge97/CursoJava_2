package org.oyataco.interfaces.repositorio;

import org.oyataco.interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    //Methods
    List<Cliente> listar(int desde, int hasta);

}
