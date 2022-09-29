package org.oyataco.abstractas.form.elementos;

public class InputForm extends  ElementoForm{

    private String tipo="text";



    //Constructor
    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    //Getter&Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Methods
    @Override
    public String dibujarHtml() {
        return "<input type='"+this.tipo+"' name='"+this.nombre+"' value='"+this.valor+"'>";
    }
}
