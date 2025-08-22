package lista;

public class ListaEncadeadaSemFim {
    private int size = 0;
    private No first;
    //privade 
    public No findEnd(){
        No cur = first;

        for (int i = 0; i < size; i++) {
            if (cur.getNext() == null) {
                return cur;
            }else{
                cur = cur.getNext();
            }
        }
        return cur;
    }

    @Override // importante
    public String toString() { // qnd é toString, pode dar sout automatico
        No no = first;
        String resposta = "";
        for (int i = 0; i < size; i++) {
            resposta = resposta + " " + no.getElemento() + " ";
            no = no.getNext();
        }
        return resposta;
    }

    public void toRemoveAt(int pos) {
        No atual = findEnd();
        // if (size == 0) return;
        if (pos == 0) {
            toRemoveFirst();
            return;
        }
        if (pos == size) {
            toRemoveLast();
            return;
        }
        if (size == 1) {
            first = null;
            atual = null;
            return;
        }

        No current = first;// no atual recebe primeiro no[current = atual]
        No next = current.getNext();

        for (int i = 0; i < pos - 1; i++) {
            current = current.getNext();
            next = current.getNext().getNext();
        }

        current.setNext(next);
        size--;

    }

    public void toRemoveLast() {
        if (size == 0) {
            return;
        }

        No current = first;// no atual recebe primeiro no[current = atual]

        for (int i = 0; i < size - 1; i++) {
            current = current.getNext();
        }

        current.setNext(null);
        size--;

    }

    public void toRemoveFirst() {
        if (size == 0) {
            return;
        }

        first = first.getNext();
        size--;

    }

    public void show() {
        No iterator = first;
        System.out.println("Lixta: ");

        for (int i = 0; i < size; i++) {
            System.out.print(iterator.getElemento() + " ");
            iterator = iterator.getNext();
        }

    }

    public void addAt(int pos, int element) {

        if (pos == 0) { // add to start
            addFirst(element);
            return;
        }
        if (pos == size) { // add to last
            addLast(element);
            return;
        }

        // add to pos that the user wants:
        No no = new No();
        no.setElemento(element);
        no.setNext(null);
        No current = first;// no atual recebe primeiro no[current = atual]

        for (int i = 0; i < pos - 1; i++) {
            current = current.getNext();
        }

        no.setNext(current.getNext());
        current.setNext(no);
        size++;

    };

    public void addLast(int elemento) {
        No atual = findEnd();
        No no = new No();
        no.setElemento(elemento);
        no.setNext(null);

        if (size == 0) { // blank|void list
            this.first = no;

        } else {
            atual.setNext(no);
        }

        atual = no;
        size++;

    }

    public void addFirst(int elemento) {
        No atual = findEnd();

        No no = new No();
        no.setElemento(elemento);
        no.setNext(null);

        if (size == 0) { // blank|void list
            atual = no;

        } else {
            no.setNext(first);
        }

        this.first = no;
        size++;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int tamanho) {
        this.size = tamanho;
    }

}
