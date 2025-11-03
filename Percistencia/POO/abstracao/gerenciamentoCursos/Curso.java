public class Curso {
    private Semestre semestre;
    private String nome;

  

    public Curso(Semestre semestre, String nome) {
        this.semestre = semestre;
        this.nome = nome;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
