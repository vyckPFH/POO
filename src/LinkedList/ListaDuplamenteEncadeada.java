package LinkedList;

import lista.No;

public class ListaDuplamenteEncadeada {
    private int size;
    private NoLinkedList first;
    private NoLinkedList last;
    private NoLinkedList before;
    private NoLinkedList next;

     @Override // importante
    public String toString() { 
        NoLinkedList no = first;
        String resposta = "";
        for (int i = 0; i < size; i++) {
            resposta = resposta + " " + no.getElemento() + " ";
            no = no.getProximo();
        }
        return resposta;
    }
}
