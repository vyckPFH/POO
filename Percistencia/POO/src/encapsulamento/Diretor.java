package encapsulamento;

public class Diretor {
    private String paisOrigem;
    private String nome;

    private Filme filme;

    // public Diretor(int a, String paisOrigem){

    // }

    public Diretor(String nome) {
        this.nome = nome;
    }

    public Diretor() {
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
}
