package org.oyataco.abstractas.form;

import org.oyataco.abstractas.form.elementos.ElementoForm;
import org.oyataco.abstractas.form.elementos.InputForm;
import org.oyataco.abstractas.form.elementos.SelectForm;
import org.oyataco.abstractas.form.elementos.TextAreaForm;
import org.oyataco.abstractas.form.elementos.select.Opcion;
import org.oyataco.abstractas.form.validador.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

       /* ElementoForm ele=new ElementoForm(){    //Clase anonima, no tiene nombre ni nada, solo se implementa al vuelo la clase abstracta
                                                  //para poder utilizar este objeto no es reutilizable, solo se utiliza en este metodo main y ya
            @Override
            public String dibujarHtml() {
                return null;
            }
        }:*/


        InputForm username=new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password=new InputForm("contraseña","password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6,12));

        InputForm email=new InputForm("email","email");
        email.addValidador(new RequeridoValidador());
        email.addValidador(new EmailValidador());

        InputForm edad=new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia=new TextAreaForm("exp",5,9);


        SelectForm lenguaje=new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNulo());

        Opcion java=new Opcion("1","Java");//Inicializando
        lenguaje.addOpcion(java);//Añadiendo
        lenguaje.addOpcion(new Opcion("2","Python"));//Inicializando+Añadiendo
        lenguaje.addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));


        ElementoForm saludar=new ElementoForm() {//Clase anonima, no tiene nombre ni nada, solo se implementa al vuelo la clase abstracta
                                                //para poder utilizar este objeto no es reutilizable, solo se utiliza en este metodo main y ya

            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("Hola que tal este campo está desabilitado!");
        username.setValor("");
        password.setValor("Syste");
        email.setValor("oscar.yatacogmail.com");
        edad.setValor("28l");
        experiencia.setValor("...más de 10 años de experiencia...");
        java.setSelected(true);

        List<ElementoForm> elemento=new ArrayList<>();
        elemento.add(username);
        elemento.add(password);
        elemento.add(email);
        elemento.add(edad);
        elemento.add(experiencia);
        elemento.add(lenguaje);
        elemento.add(saludar);

        for (ElementoForm e: elemento){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }


        //bucle anidado de for-each para mostrar las validaciones
        elemento.forEach(e->{
            if (!e.esValido()){
                e.getErrores().forEach(System.out::println);    //lambda
            }
        });

    }
}
