package lista;

//new cria um espaço de memoria
// se for apenas No nome = algo, é um apelido ou uma indicação e não necessariamente um novo memory space

public class ListaEncadeada {
    private int size = 0;
    private No first;
    private No last;

    public void remove

    public void show() {
        No iterator = first;
        System.out.println("Lixta: ");

        for (int i = 0; i < size; i++) {
            System.out.println(iterator.getElemento() + " ");
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

        for (int i = 0; i < pos-1; i++) {
            current = current.getNext();
        }

        no.setNext(current.getNext());
        current.setNext(no);
        size++;

    };

    public void addLast(int elemento) {
        No no = new No();
        no.setElemento(elemento);
        no.setNext(null);

        if (size == 0) { // blank|void list
            this.first = no;

        } else {
            this.last.setNext(no);
        }

        this.last = no;
        size++;

    }

    public void addFirst(int elemento) {
        No no = new No();
        no.setElemento(elemento);
        no.setNext(null);

        if (size == 0) { // blank|void list
            this.last = no;

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
