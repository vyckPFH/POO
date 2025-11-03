package LinkedList;

public class NoLinkedList {

    private int elemento;
    private NoLinkedList next;
    private NoLinkedList before;

    public NoLinkedList() {
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NoLinkedList getNext() {
        return next;
    }

    public void setNext(NoLinkedList proximo) {
        this.next = proximo;
    }

    public NoLinkedList getBefore() {
        return before;
    }

    public void setBefore(NoLinkedList anterior) {
        this.before = anterior;
    }
    

}
