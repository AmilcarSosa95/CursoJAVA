package com.curso.segundasesion;

public class ServicioFunciones implements IControl {
    ClaseFunciones funciones = new ClaseFunciones();

    @Override
    public void insertar(){
        System.out.println("haciendo mas funcionalidad");
        funciones.insertar();
    }

    @Override
    public void findAll(){
        funciones.findAll();
    }

    @Override
    public void actualizar(){
        borrar();
        System.out.println("haciendo mas funcionalidad al actualizar");
        funciones.actualizar();
    }

    private void  borrar(){
        System.out.println("borrando");
    }

}
