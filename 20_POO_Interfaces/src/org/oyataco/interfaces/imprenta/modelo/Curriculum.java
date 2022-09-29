package org.oyataco.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String carrera;
    private List<String> experiencias;




    //Constructor
    public Curriculum(String persona, String carrera,String contenido) {
        super(contenido);
        this.persona=persona;
        this.persona=carrera;
        this.experiencias=new ArrayList<>();

    }

    public Curriculum addExperiencia(String exp){
        this.experiencias.add(exp);
        return this;
    }

    //Methods
    @Override
    public String imprimir() {
        StringBuilder sb=new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\nProfesión: ").append(this.carrera)
                .append("\nExperiencias: ");
        for(String exp : experiencias){
            sb.append("- ").append(exp).append("\n");
        }

        return sb.toString();
    }
}
