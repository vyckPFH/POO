package lista;

public class testListaSemFim {
    public static void main(String[] args) {
        ListaEncadeadaSemFim lista = new ListaEncadeadaSemFim();

        lista.addFirst(1);

        lista.addLast(4);

        lista.addFirst(0);

        lista.addLast(5);
     //   lista.addLast(9);
      //  lista.addLast(0);
        System.out.println(lista);
    }
}
