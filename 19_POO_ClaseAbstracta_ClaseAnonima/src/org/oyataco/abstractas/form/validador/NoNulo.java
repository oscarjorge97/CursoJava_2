package org.oyataco.abstractas.form.validador;

public class NoNulo extends Validador{

    protected String mensaje="el campo %s no puede ser nulo";



    //Methods Heredados abstractos
    @Override
    public void setMensaje(String mensaje) {
    this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor != null;   //if simplificado, si es distinto de null devolverá true, si es null devolverá false

        //return (valor != null)? true:false

        /*if (valor!=null){
             return true;
         }else{
             return false;
         }*/
    }
}
