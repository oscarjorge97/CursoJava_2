package org.oyataco.datatime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoEra;

public class EjemploLocalDate {
    public static void main(String[] args) {
        //crear fecha de hoy
        LocalDate fechaActual=LocalDate.now();//no se usa el operador new ya que es estatico

        System.out.println("fechaActual con LocalDate.now() = " + fechaActual);

        DayOfWeek diaDeLaSemanaActual=fechaActual.getDayOfWeek();
        System.out.println("diaDeLaSemanaActual = " + diaDeLaSemanaActual);

        int mesDelAñoActualNumero=fechaActual.getMonthValue();
        System.out.println("mesDelAñoActualNumero = " + mesDelAñoActualNumero);
        
        Month mesDelAñoActualNombre=fechaActual.getMonth();
        System.out.println("mesDelAñoActual = " + mesDelAñoActualNombre);

        int diaDelMesActual=fechaActual.getDayOfMonth();
        System.out.println("diaDelMes = " + diaDelMesActual);

        int AñoActual=fechaActual.getYear();
        System.out.println("AñoActual = " + AñoActual);

        int diaDelAño=fechaActual.getDayOfYear();
        System.out.println("diaDelAño = " + diaDelAño);

        IsoEra eraActual=fechaActual.getEra();
        System.out.println("eraActual = " + eraActual);


        
        //crear fecha a partir de una fecha insertada
        fechaActual=LocalDate.of(2020,12,25);
        System.out.println("fechaActual con LocalDate.of (int,int,int)= " + fechaActual);

        //crear fecha a partir de una fecha insertada pero usando el Enum de mes
        fechaActual=LocalDate.of(2020, Month.NOVEMBER,11);
        System.out.println("fechaActual con LocalDate.of (int,Month.NOVEMBER,int)= " + fechaActual);

        //crear fecha a partir de una fecha insertada pero parseando a String
        fechaActual=LocalDate.parse("2020-02-01");
        System.out.println("fechaActual con LocalDate.parse(String)= " + fechaActual);

        //crear fecha a partir del día siguiente
        LocalDate diaDeManiana=LocalDate.now().plusDays(1);
        System.out.println("diaDeMañana con LocalDate.now().plusDays(int)= " + diaDeManiana);

        //crear fecha a partir de una fecha insertada pero con un mes menos, mismo dia
        LocalDate mesAnteriorMismoDia=LocalDate.now().minusMonths(1);
        System.out.println("mesAnteriorMismoDia conLocalDate.now().minusMotnhs(int) = " + mesAnteriorMismoDia);

        //Obtener el día de la semana en letras
        DayOfWeek miercoles=LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("Día con DayOfWeek con LocalDate.parse(String).getDayOfWeek() = " + miercoles);

        //Obtener día del mes en numero
        int diaDelMes=LocalDate.of(2020,11,12).getDayOfMonth();
        System.out.println("diaDelMes con Localdate.of(int,int,int).getDayOfMonth()= " + diaDelMes);

        //Saber si es año bisiesto
        boolean esBisiesto=LocalDate.now().isLeapYear();
        System.out.println("esBisiesto con LocalDate.now().isLeap.Year()= " + esBisiesto);

        //Comparar fechas
        boolean esAntes=LocalDate.now().isBefore(LocalDate.parse("2020-04-03"));
        System.out.println("La fecha de ahora esAntes que la fecha parse? = " + esAntes);

        boolean esDespues=LocalDate.now().isAfter(LocalDate.parse("2020-04-03"));
        System.out.println("La fecha de ahora esDespues que la fecha parse?= " + esDespues);




    }


}
