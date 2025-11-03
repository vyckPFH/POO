package LinkedList;

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

    public void addFirst(int elemento){
        NoLinkedList cur = findEnd();

        NoLinkedList no = new NoLinkedList(); // cria o no a ser adicionado
        no.setElemento(elemento); // coloca o elemento no nó
        no.setNext(first); // coloca o proximo do nó no primeiro
        no.setBefore(null); // coloca o anterios do nó em null

        if (size == 0) { // blank|void list
            cur = no;

        } else {
            no.setNext(first);
        }
        
        this.first = no; // coloca o nó como primeiro
        size++;
    }

    public NoLinkedList findEnd(){
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
