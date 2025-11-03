package lista;

public class TestList {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addLast(200);
        lista.addLast(3);
        lista.addLast(9);

        lista.addLast(150);

        lista.addLast(1);

        lista.show();

        int pos= 1;
        if (pos < 0) {
            pos = 0;
        }
        if (pos == 1) {
            lista.toRemoveAt((pos));
        }else{
            lista.toRemoveAt((pos--));
        }
        
        lista.show();

        
    //     lista.addAt((pos-1), -1);
    //     lista.show();
     }
}
