package LinkedList;

import lista.No;

public class ListaDuplamenteEncadeada {
    private int size = 0;
    private NoLinkedList first;
    private NoLinkedList bef;
    private NoLinkedList next;

     @Override // importante
    public String toString() { 
        NoLinkedList no = first;
        String resposta = "";
        for (int i = 0; i < size; i++) {
            resposta = resposta + " " + no.getElemento() + " ";
            no = no.getNext();
        }
        return resposta;
    }

    public No findEnd(){
        NoLinkedList cur = first;

        for (int i = 0; i < size; i++) {
            if (cur.getNext() == null) {
                return cur;
            }else{
                cur = cur.getNext();
            }
        }
        return cur;
    }

}
