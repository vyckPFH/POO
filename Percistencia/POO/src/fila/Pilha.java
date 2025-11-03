package fila;

import lista.ListaEncadeada;

public class Pilha{ //FILO = first in last out
    ListaEncadeada pilha = new ListaEncadeada();

    public Pilha(){

    }

    public void printStack(){
        pilha.show();
    }

    public void push(int elemento){
        pilha.addLast(elemento);
    }

    public void pop(){
        pilha.toRemoveLast();
    }

    @Override
    public String toString(){
        return "[" + pilha + "]";
    }

}