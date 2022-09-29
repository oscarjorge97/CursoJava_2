package org.oyataco.abstractas.form.validador;

public class LargoValidador extends Validador{

    protected String mensaje="El campo debe tener mínimo %d caracteres y máximo %d caracteres";
    private int min=0;
    private int max=Integer.MAX_VALUE;//el maximo valor de int



    //Constructor
    public LargoValidador(){

    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }



    //Setter
    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    //Methods abstractos
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
        this.mensaje=String.format(this.mensaje,this.min,this.max);

        if(valor==null){
            return true;
        }
        int largo=valor.length();
        return largo >= min && largo<=max;
    }
}
