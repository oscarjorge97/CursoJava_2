package org.oyataco.abstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje="El campo %s tiene un formato de correo inválido";
    private final static String EMAIL_REGEX="^(.+)@(.+)$";  //validará que tengamos algo antes del arroba, el arroba y despues del arroba(un solo @)



    //Methods
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

        return valor.matches(EMAIL_REGEX);
    }
}
