package com.curso.tercerasesion;

import com.curso.tercerasesion.genericos.Funciones;
import com.curso.tercerasesion.genericos.Persona;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeSet;

public class PrincipalTerceraSesion {

    public static void main(String[] args) {
//        String hi = " Hi";
//        Funciones<String> funciones = new Funciones<>(hi);
//        String nombre = " AMILCAR";
//        funciones.juntar(nombre);
//
//
//        Funciones<Integer> funcionesDos = new Funciones<>(2);
//        funcionesDos.juntar(3);

//        Persona personaUno = new Persona("Amilcar", 25);
//        Persona personaDos = new Persona("Kike", 30);
//        Persona personaTres = new Persona("Kike", 30);
//
//        System.out.println(personaUno.hashCode());
//        System.out.println(personaDos.hashCode());
//        System.out.println(personaTres.hashCode());

        ArrayList<String> lista = new ArrayList<>();
        lista.add("cadena 2");
        lista.add("cadena 1");
        lista.add("cadena 0");
        lista.add("cadena 3");
        lista.add("cadena 4");

        System.out.println(lista);

        //probar lista
        System.out.println(lista.get(1));

        //borrado por elemento
        lista.remove("cadena 2 ");
        System.out.println(lista);

        //borrado por elemento
        lista.remove(2);
        System.out.println(lista);

        for (String s: lista) {
            if (s.equals("cadena 1"))
            System.out.println(s);
        }

        lista.forEach(s -> {
            System.out.println(s);
        });


        System.out.println(".....:::Probando DEQUE:::.....");

        ArrayDeque<String> deque = new ArrayDeque<>();
        //fifo add remove
        //lifo push pop

        deque.add("e1");
        deque.add("e2");
        deque.add("e3");
        deque.add("e4");
        deque.push("e5");
        deque.pop();
        deque.add("e6");
        deque.remove();

        System.out.println(deque);


        System.out.println(".....:::Probando Set:::.....");

        TreeSet<String> set = new TreeSet<>();
        //fifo add remove
        //lifo push pop

        set.add("e1");
        set.add("e2");
        set.add("e3");
        set.add("e4");
        set.add("e4");
        set.add("e5");


        System.out.println(deque);


    }

}
