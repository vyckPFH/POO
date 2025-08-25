package LinkedList;

public class NoLinkedList {

    private Object elemento = new Object();
    private NoLinkedList proximo = new NoLinkedList();
    private NoLinkedList anterior = new NoLinkedList();

    public NoLinkedList() {
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NoLinkedList getProximo() {
        return proximo;
    }

    public void setProximo(NoLinkedList proximo) {
        this.proximo = proximo;
    }

    public NoLinkedList getAnterior() {
        return anterior;
    }

    public void setAnterior(NoLinkedList anterior) {
        this.anterior = anterior;
    }
    

}
