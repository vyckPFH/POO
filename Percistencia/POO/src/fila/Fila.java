package fila;

import lista.ListaEncadeada;

public class Fila { //FIFO = first in first out
    private ListaEncadeada fila = new ListaEncadeada();

    // Construtor 
    public Fila() {
    }

    @Override
    public String toString(){
        return "[" + fila + "]";
    }

    public void printQueue(){//printar a fila :D
        System.out.println(fila);
    }
    
    public void enqueue(int elemento){
        fila.addFirst(elemento);//put element on the begin of the queue :D
    }

    public void dequeue(){ //remove the first element of the queue :D
        fila.toRemoveFirst();
    }

}
