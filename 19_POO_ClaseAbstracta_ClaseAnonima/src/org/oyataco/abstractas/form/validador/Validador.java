package org.oyataco.abstractas.form.validador;

abstract public class Validador {

    protected String mensaje;




    //Getter&Setter
    abstract public void setMensaje(String mensaje);

    abstract public String getMensaje();



    //Method
    abstract public boolean esValido(String valor);
}
