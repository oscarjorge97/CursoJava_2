package org.oyataco.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;



    //Constructor

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas=new ArrayList<>();

    }


    //Methods
    public Libro addPagina (Imprimible pagina){ //Deberiamos poner en los parametros 'Pagina pagina' , pero como Hoja es su padre también sirve, es más generico
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb=new StringBuilder("Titulo");
        sb.append(this.titulo).append("\nAutor: ")
                .append(this.autor).append("\nGénero: ")
                .append(this.genero);

        for (Imprimible pag: this.paginas){
            sb.append("Página: ").append(pag.imprimir()).append("\n");
        }
    return sb.toString();
    }
}
