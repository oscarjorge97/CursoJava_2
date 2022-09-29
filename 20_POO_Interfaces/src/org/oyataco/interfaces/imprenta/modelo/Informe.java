package org.oyataco.interfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private String autor;
    private String revisor;




    //Constructor
    public Informe(String contenido) {
        super(contenido);
    }

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    //Mhetods
    @Override
    public String imprimir() {
        return "Informe escrito por: "+autor+
                ", Revisado por: "+revisor+
                "\n"+this.contenido;
    }
}
