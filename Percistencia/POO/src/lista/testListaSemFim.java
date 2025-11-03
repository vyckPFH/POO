package lista;

public class testListaSemFim {
    public static void main(String[] args) {
        ListaEncadeadaSemFim lista = new ListaEncadeadaSemFim();

        lista.addFirst(1);

        lista.addLast(4);

        lista.addFirst(0);

        lista.addLast(5);
    
        System.out.println(lista);
        lista.toRemoveLast();
        System.out.println(lista);

        
    }
}
