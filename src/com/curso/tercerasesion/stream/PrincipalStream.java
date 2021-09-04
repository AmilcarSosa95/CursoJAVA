package com.curso.tercerasesion.stream;

import java.util.ArrayList;
import java.util.Locale;

public class PrincipalStream {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(29,"cdmx"));
        personas.add(new Persona(27,"mty"));
        personas.add(new Persona(23,"cdmx"));
        personas.add(new Persona(30,"tlx"));
        personas.add(new Persona(11,"oax"));
        personas.add(new Persona(21,"mty"));
        personas.add(new Persona(40,"mty"));
        personas.add(new Persona(46,"tlx"));

        personas.stream().filter(persona -> persona.getCiudad().toLowerCase().equals("mty")).forEach(persona -> System.out.println(persona));
        System.out.println("ssssssssssssssssssssssssssssssssssssssss");
        personas.stream().filter(persona -> persona.getCiudad().toLowerCase().equals("mty")).filter(persona -> persona.getEdad() > 25).forEach(persona -> System.out.println(persona));

    }
}
