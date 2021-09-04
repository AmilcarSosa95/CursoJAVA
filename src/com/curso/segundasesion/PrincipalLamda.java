package com.curso.segundasesion;

public class PrincipalLamda {

    public static void main(String[] args) {

        Prueba pr = (a, b) -> a.contains(b);

        Prueba pr2 = (t, s) -> t.startsWith("h");

        Prueba prA = (t, s) -> {
            System.out.println(t);
            System.out.println(s);

            return t.equals(s);
        };

        double array[] = {1.1, 2.2, 3.0};

        PruebaDos pruebaDos = (a) -> {
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);

            System.out.println(a.length);

            return a[0];
        };

        System.out.println(pruebaDos.operacion(array));

        String texto = "Amilcar";

        PruebaDos pruebaTres = (t) -> {
          double multi = 1;

          for (double x: t ){
              multi *= x;
          }
          System.out.println(texto);
          return multi;
        };

        System.out.println(pruebaTres.operacion(array));

        System.out.println(pr.busqueda("Hola","la"));
        System.out.println(pr2.busqueda("Cadena","Na"));
        System.out.println(prA.busqueda("Cadena","Na"));

    }

}
