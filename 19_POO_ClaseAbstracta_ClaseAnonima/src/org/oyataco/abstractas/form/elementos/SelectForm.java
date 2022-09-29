package org.oyataco.abstractas.form.elementos;

import org.oyataco.abstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;    //List es una interfaz asociada a un tipo


    //Constructor


    public SelectForm(String nombre) {
        super(nombre);
        this.opciones=new ArrayList<Opcion>();  //Hay que inicializar el List ,se puede declarar con la interfaz List, pero se inicializa con ArrayList la Clase
    }

    public SelectForm(String nombre, List<Opcion> opciones){
        super(nombre);
        this.opciones=opciones;
    }



    //Methods
    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb=new StringBuilder("<select ");
        sb.append("name='").append(this.nombre).append("'>");

        for(Opcion opcion:this.opciones) {    //Por cada opcion crearemos un elemento html
            sb.append("\n<option value='").append(opcion.getValor()).append("'");
            if (opcion.isSelected()){
                sb.append(" selected");
                this.valor=opcion.getValor();
            }
                sb.append(">").append(opcion.getNombre()).append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
