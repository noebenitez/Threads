package com.company;

import java.util.LinkedList;

public class Main {

    private static Impresora impresora;
    private static Thread persona1;
    private static Thread persona2;
    private static Thread persona3;

    public static void main(String[] args) {

        impresora = new Impresora();

        Documento documento1 = new Documento(1, "Hola.txt");
        Documento documento2 = new Documento(2, "Naturales.doc");
        Documento documento3 = new Documento(3, "Modulo.pdf");
        Documento documento4 = new Documento(4, "Matemática.doc");
        Documento documento5 = new Documento(5, "Programacion.pdf");
        Documento documento6 = new Documento(6, "Historia.doc");
        Documento documento7 = new Documento(7, "Apuntes.txt");
        Documento documento8 = new Documento(8, "Ingles.doc");
        Documento documento9 = new Documento(9, "Literatura.doc");
        Documento documento10 = new Documento(10, "DonQuijote.pdf");
        Documento documento11 = new Documento(11, "Geografia.doc");
        Documento documento12 = new Documento(12, "Biologia.txt");

        LinkedList documentos1 = new LinkedList<Documento>();
        documentos1.add(documento1);
        documentos1.add(documento2);
        documentos1.add(documento3);
        documentos1.add(documento4);

        LinkedList documentos2 = new LinkedList<Documento>();
        documentos2.add(documento5);
        documentos2.add(documento6);
        documentos2.add(documento7);
        documentos2.add(documento8);

        LinkedList documentos3 = new LinkedList<Documento>();
        documentos3.add(documento9);
        documentos3.add(documento10);
        documentos3.add(documento11);
        documentos3.add(documento12);

        persona1 = new Thread(new Persona("Juana", impresora, documentos1));
        persona2 = new Thread(new Persona("Pedro", impresora, documentos2));
        persona3 = new Thread(new Persona("Rocio", impresora, documentos3));

        persona1.start();
        persona2.start();
        persona3.start();


    }
}
