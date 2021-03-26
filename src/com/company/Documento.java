package com.company;

public class Documento {

    private Integer id;
    private String nombre;

    public Documento(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
