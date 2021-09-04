package com.curso.segundasesion;

@FunctionalInterface
public interface Prueba {
    String NOMBRE = "";

    boolean busqueda(String a, String b);

    static void metS(){
     System.out.println("metodo s");
    }

    static void sDos(){
        System.out.println("metodo S dos");
    }

    default void metD(){
        System.out.println("metodo D");
    }


}
