package com.curso.segundasesion;

public class Anidada {

    public class InnerUno {
        public int suma(int a, int b){
            return a+b;
        }
    }

    public class InnerDos{
        public int resta(int a, int b){
            return a-b;
        }
    }
}
