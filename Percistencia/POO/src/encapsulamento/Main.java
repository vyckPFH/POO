package encapsulamento;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.titulo = "formula 1";

        // filme.categoria = "Ação";
        System.out.println(filme.titulo);

        filme.setResumo("blablabla...");
        Diretor diretor = new Diretor("Joseph");
        filme.setDiretor(diretor);
        

    }
}
