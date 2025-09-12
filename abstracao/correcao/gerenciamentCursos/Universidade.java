

public class Universidade {
    private String nome;
    private String sigla;
    private String cnpj;
    // atributos de associacao
    private Professor diretorGeral;
    private Professor diretorEnsino;

    // construtores
    public Universidade() {

    }

    // metodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Professor getDiretorGeral() {
        return diretorGeral;
    }

    public void setDiretorGeral(Professor diretorGeral) {
        this.diretorGeral = diretorGeral;
    }

    public Professor getDiretorEnsino() {
        return diretorEnsino;
    }

    public void setDiretorEnsino(Professor diretorEnsino) {
        this.diretorEnsino = diretorEnsino;
    }

}
