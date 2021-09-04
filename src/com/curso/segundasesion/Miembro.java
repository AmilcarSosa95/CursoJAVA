package com.curso.segundasesion;

public class Miembro {
    int dato;

    public class Inner {
        int dato;

        public void funcion(){
            System.out.println("miembro :"+ Miembro.this.dato );
            System.out.println("inner: " + this.dato);
        }
    }

}
