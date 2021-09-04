package com.curso.cuartasesion;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalDouble;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Rogelio", 41, LocalDate.of(2018, Month.JULY, 27), "rogelio@garzas.uatx.mx"));
        clientes.add(new Cliente("Amilcar", 18, LocalDate.of(2019, Month.DECEMBER, 18), "amilcar@sosa.com"));
        clientes.add(new Cliente("Enrique", 31, LocalDate.of(2018, Month.SEPTEMBER, 2), "enrique@hotmail.com"));
        clientes.add(new Cliente("Rous", 24, LocalDate.of(2018, Month.APRIL, 30), "rous@gmail.com"));
        clientes.add(new Cliente("Shaila", 23, LocalDate.of(2019, Month.JUNE, 12), "shaila@outlook.com"));
        clientes.add(new Cliente("Serch", 26, LocalDate.of(2018, Month.FEBRUARY, 2), "serch@gmail.com"));
        clientes.add(new Cliente("Juan", 31, LocalDate.of(2019, Month.JULY, 12), "juan@garzas.uatx.mx"));
        clientes.add(new Cliente("Juan", 40, LocalDate.of(2019, Month.JULY, 12), "juan@garzas.uatx.mx"));

//        clientes.stream().filter(P -> P.getCorreo().toLowerCase().contains("gmail")).forEach(cliente -> System.out.println(cliente));

//        clientes.stream().filter(p -> p.getFechaAlta().getYear() == 2019).forEach(cliente -> System.out.println(cliente.toString()));

//        clientes.stream().sorted().forEach(cliente -> System.out.println(cliente.toString()));



//        clientes.stream().sorted((t, s) -> s.getFechaAlta().compareTo(t.getFechaAlta())).forEach(cliente -> System.out.println(cliente));

        long numeroClientes = clientes.stream().filter(p-> p.getEdad() > 30).count();

//        System.out.println( "hay "+ numeroClientes+ " mayores de  30 años ");


//        sumar todas las edades de clinetes

        int suma = clientes.stream().mapToInt(t -> t.getEdad()).sum();
//        System.out.println( suma);

        OptionalDouble opcinal = clientes.stream().mapToDouble(t -> t.getEdad()).average();

//        System.out.println( "promedio de edades: " + opcinal.getAsDouble()
//        );

//        clientes.stream().filter(cliente -> cliente.getEdad() == 18).forEach(cliente -> System.out.println(cliente));

  Optional<Cliente>  cliente = clientes.stream().filter(t -> t.getEdad() == 40).findFirst();

  if (cliente.isPresent()){
      System.out.println(cliente.get());
  }

  clientes.add(new Cliente("Naru", 40, LocalDate.of(2019, Month.JULY, 12), "naru@garzas.uatx.mx"));
  clientes.stream().filter(t -> t.getEdad() == 40).forEach(s ->  System.out.println(s));





    }
}
