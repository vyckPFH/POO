import java.util.Deque;
import java.util.LinkedList;

public class FilaLinkedList {
    
    // Queue é uma interface (contrato)
    // LinkedList implementou o contrato

    public static void main(String[] args) {
        //fila(fifo)
        // Queue fila = new LinkedList<>();

        // fila.add("amama");
        // fila.add(1);
        // fila.add(2.3);

        // System.out.println(fila);
        // fila.remove();
        // System.out.println(fila);

        // System.out.println();

        //pilha(filo)
        Deque pilha = new LinkedList<>(); //deque é uma interface & deque == pilha

        pilha.push("1");
        pilha.push("2");
        pilha.push("3");


        System.out.println(pilha.peek());
        
        // System.out.println(pilha);
        // pilha.pop();
        // System.out.println(pilha);
    }
}
