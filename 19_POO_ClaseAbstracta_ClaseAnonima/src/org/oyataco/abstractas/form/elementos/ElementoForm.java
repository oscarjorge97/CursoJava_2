package org.oyataco.abstractas.form.elementos;

import org.oyataco.abstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;
    private List<Validador> validadores;
    private List<String> errores;



    //Constructor
    public ElementoForm(){
        this.validadores=new ArrayList<>();
        this.errores=new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }


    //Setter
    public void setValor(String valor) {
        this.valor = valor;
    }
    //Getter
    public List<String> getErrores() {
        return errores;
    }

    public String getNombre() {
        return nombre;
    }

    //methods
    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;    //retornamos el mismo tipo de la clase para invocar el metodo addValidador de forma encadenada
    }

    public Boolean esValido(){
        for(Validador v:validadores){
            if (!(v.esValido(this.valor))){
                this.errores.add(String.format(v.getMensaje(),nombre));
            }
        }
        return this.errores.isEmpty();
    }



    public abstract String dibujarHtml();//los metodos abstractos van con punto y coma, no con llave


}
