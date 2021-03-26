package com.company;

import java.util.LinkedList;

public class Persona implements Runnable{

    private String nombre;
    Impresora impresora;
    private LinkedList<Documento> documentos;     //Documentos que quiere imprimir

    public Persona(String nombre, Impresora impresora, LinkedList<Documento> documentos) {
        this.nombre = nombre;
        this.impresora = impresora;
        this.documentos = documentos;
    }

    @Override
    public void run() {

        for (int i = 0; i < documentos.size(); i++){
            Documento doc = documentos.pop();
            impresora.solicitudImpresion(doc);
            System.out.println(nombre + " a solicitado la impresión del documento " + doc.getNombre());

            impresora.imprimir();
        }
    }

    public void mostrarDocumentos(){
        System.out.println("\n" + nombre + " imprimió los documentos: ");
        documentos.forEach(doc -> {
            System.out.println(doc.getNombre() + "\n");
        });
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }


}
