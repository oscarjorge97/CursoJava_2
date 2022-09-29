package org.oyataco.interfaces.imprenta.modelo;

abstract public class Hoja {
    protected String contenido;


    //Constructor
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    //Methods
    abstract public String imprimir();
}
