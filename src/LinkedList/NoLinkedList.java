package LinkedList;

public class NoLinkedList {

    private Object elemento = new Object();
    private NoLinkedList next = new NoLinkedList();
    private NoLinkedList before = new NoLinkedList();

    public NoLinkedList() {
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
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
