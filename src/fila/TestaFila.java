package fila;

import java.util.Scanner;

public class TestaFila {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        do {

            System.out.println("valor que sera adicionado: ");
            int x = LER.nextInt();
            fila.enqueue(x);
            pilha.push(x);
            System.out.println("Continuar? 's'-> sim | 'n'-> não:");

        } while (LER.next().charAt(0) != 'n');

        System.out.println(fila);
        System.out.println(pilha);

        System.out.println("Deseja remover? 's-> sim || 'n'-> nop");

        while (LER.next().charAt(0) != 'n') {
           
            fila.dequeue();
            pilha.pop();
            System.out.println(fila);
            System.out.println(pilha);
        }

    }
}
