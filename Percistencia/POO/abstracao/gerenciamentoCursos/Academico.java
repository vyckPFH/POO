public class Academico {
    private Pessoa aluno;
    private Turma turma;
    private int matricula;
    private float mensalidade;
    private Curso curso;
    

    public Academico(Pessoa aluno, Turma turma, int matricula, Curso curso) {
        this.aluno = aluno;
        this.turma = turma;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Pessoa getAluno() {
        return aluno;
    }

    public void setAluno(Pessoa aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
}
