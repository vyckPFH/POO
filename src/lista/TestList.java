package lista;

public class TestList {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addFirst(1);
        lista.addFirst(5);
        lista.addFirst(4);

        lista.show();
        lista.toRemoveFirst();
        lista.show();

    //     int pos= 2;
    //     if (pos < 0) {
    //         pos = 0;
    //     }
    //     lista.addAt((pos-1), -1);
    //     lista.show();
     }
}
