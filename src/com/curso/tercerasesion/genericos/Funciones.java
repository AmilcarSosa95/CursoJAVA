package com.curso.tercerasesion.genericos;

public class Funciones<T> {
    private T dato;

    public Funciones(T dato) {
        this.dato = dato;
    }

    public void juntar(T datoDos) {
        System.out.println("salida" + dato + datoDos);
    }

}
