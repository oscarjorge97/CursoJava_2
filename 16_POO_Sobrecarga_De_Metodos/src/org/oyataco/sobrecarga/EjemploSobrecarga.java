package org.oyataco.sobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        //La sobrecarga se refiere a la posibilidad de tener dos o más métodos con el mismo nombre pero con funcionalidad diferente
        Calculadora calculadora=new Calculadora();

        System.out.println("sumar int= "+calculadora.sumar(10,5));
        System.out.println("sumar double= "+calculadora.sumar(10.5,5.5));
        System.out.println("sumar int-double= "+calculadora.sumar(10,5.5));
        System.out.println("sumar double-int= "+calculadora.sumar(10.5,6));
        System.out.println("sumar String= "+calculadora.sumar("12","8"));
        System.out.println("sumar intx3= "+calculadora.sumar(20,5,15));
    }
}
