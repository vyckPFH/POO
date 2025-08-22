package fila;

import lista.ListaEncadeada;

public class Fila { //FIFO
    private ListaEncadeada fila = new ListaEncadeada();

    // Construtor 
    public Fila() {
    }
    
    public void enqueue(int elemento){
        fila.addFirst(elemento);//put element on the begin of the queue
    }

    public void dequeue(int elemento){ //remove the first element of the queue
        fila.toRemoveFirst();
    }

}
