package com.curso.segundasesion;

public class Principal {
    public static void main(String[] args) {
       /* Miembro m1 = new Miembro();
        m1.dato = 12;

        Miembro.Inner in = m1.new Inner();
        in.funcion();

        Funciones fun = new Funciones(){
            public void met() {
                System.out.println("Reimplementando metodo");
            }
        };

        Funciones fun3 = new Funciones(){
            public void met() {
                System.out.println("Reimplementando por segunda ocacion");
            }
        };



        Funciones fun2 = new Funciones();
        fun2.met();
        fun.met();
        fun3.met();*/

        Anidada anidada = new Anidada();

        Anidada.InnerUno innerUno = anidada.new InnerUno();
        int suma = innerUno.suma(10, 23);

        Anidada.InnerDos innerDos = anidada.new InnerDos();
        int resta = innerDos.resta(23, 10);

        Divicion divicionOriginal = new Divicion();
        Divicion divicion = new Divicion(){
            public double dividir(int a, int b) {
                return  a%b;
            }
        };

        double divOriginal = divicionOriginal.dividir(25, 2);

        double divMod =  divicion.dividir(25,2);
        System.out.println("Suma : "+ suma);
        System.out.println("Resta : "+ resta);
        System.out.println("Divicion Original : "+ divOriginal);
        System.out.println("Divivion Modificada  :"+ divMod);
    }
}
