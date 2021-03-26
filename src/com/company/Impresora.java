package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Impresora {

    private final Queue<Documento> cola;

    public Impresora() {
        this.cola = new LinkedList<>();
    }

    public synchronized void solicitudImpresion(Documento doc){
        cola.add(doc);
        notifyAll();
    }

    public synchronized void imprimir(){

        while (cola.isEmpty()){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Se imprimió el documento de título " + cola.remove().getNombre());
    }

}
