package com.curso.segundasesion;

public class PrincipalInterfaces {
    public static void main(String[] args){
        IControl control = new ServicioFunciones();

        ServicioFunciones funciones = new ServicioFunciones();

        control.insertar();
        control.findAll();
        control.actualizar();

        funciones.actualizar();
    }
}
