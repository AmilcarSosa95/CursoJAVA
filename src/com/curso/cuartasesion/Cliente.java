package com.curso.cuartasesion;

import java.time.LocalDate;

public class Cliente implements Comparable<Cliente> {
    private String nombre;
    private int edad;
    private LocalDate fechaAlta;
    private String correo;

    public Cliente() {
        super();
    }

    public Cliente(String nombre, int edad, LocalDate fechaAlta, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaAlta = fechaAlta;
        this.correo = correo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaAlta=" + fechaAlta +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cliente o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

}
