package org.oyataco.interfaces.imprenta;

import org.oyataco.interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv=new Curriculum("Oscar Yataco","Desarrollador de aplicaciones multiplataforma","Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullStack")
                .addExperiencia("Angular");

        Libro libro=new Libro("Erich Gamma","Patrones de diseños: Elem. Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe=new Informe("Estudio sobre microservicios","Martin Fowler","James");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
