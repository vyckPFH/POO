package lista;

public class No {

    private int elemento;
    private  No proximo;

    public No() {
    }
    public int getElemento() {
        return elemento;
    }
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public No getNext() {
        return proximo;
    }
    public void setNext(No proximo) {
        this.proximo = proximo;
    }

    
}
