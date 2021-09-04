package com.curso.tercerasesion.stream;

public class Persona {
    private int edad;
    private String ciudad;

    public Persona(int edad, String ciudad) {
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "{" +
                "edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
