package com.curso.cuartasesion;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrincipalFechas {
    public static void main(String[] args) {
        LocalTime actual = LocalTime.now();
        System.out.println(actual);
        actual = actual.plusHours(2);
        System.out.println(actual);
        actual = actual.minusMinutes(2).minusSeconds(20);
        System.out.println(actual);

        Duration diferencia;
        LocalTime ahora = LocalTime.now();
        LocalTime salida = LocalTime.of(12,0);

        diferencia = Duration.between(ahora,salida);

        System.out.println("Tiempo restante del curso: " + diferencia.getSeconds()
        );
        System.out.println("....:::::DATE");
        LocalDate hoy  = LocalDate.now();
        System.out.println(hoy);
        hoy =  hoy.plusMonths(2).plusYears(2);
        System.out.println(hoy);

        System.out.println("....:::::Primer Ejercicio:::::.....");

        actual = LocalTime.now();
        hoy = LocalDate.now();
        LocalDate aguinaldo = LocalDate.of(2021,12,17);
        LocalTime aguinaldoHoras = LocalTime.of(20,0);

        Period diferenciaFechas;
        diferenciaFechas = Period.between(hoy,aguinaldo);

        System.out.println(diferencia.toHours());

        System.out.println(diferenciaFechas.toTotalMonths());

        System.out.println("....:::::LocalDateTime:::::.....");

        LocalDateTime ldt = LocalDateTime.now();
        ldt = ldt.plusMonths(2).plusHours(3);

        System.out.println(ldt);

        System.out.println("....:::::formatter:::::.....");

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM  yyyy", Locale.CHINESE);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'El día de hoy es' dd 'de' MMMM 'del' yyyy 'y son las' hh':'mm a",Locale.ENGLISH);
        LocalDateTime fecha  = LocalDateTime.now();

        System.out.println(fecha);
        System.out.println(fecha.format(formatter));
    }
}
