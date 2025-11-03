package LinkedList;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lixta = new ListaDuplamenteEncadeada();
        
        lixta.addFirst(2);
        lixta.addFirst(7);
        lixta.addFirst(9);
        lixta.addFirst(1);
        lixta.addFirst(5);
        lixta.addFirst(10);
        lixta.addFirst(7);
        lixta.addFirst(8);
        

        // lixta.addFirst(2.555888);
        // lixta.addFirst('v');
        // lixta.addFirst(true);

        System.out.println(lixta);

    }
}
