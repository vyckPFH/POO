
import java.util.LinkedList;

public class Turma {
    private LinkedList alunos;
    private Semestre semestre;


   
    public Turma(LinkedList alunos, Semestre semestre) {
        this.alunos = alunos;
        this.semestre = semestre;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public LinkedList getAlunos() {
        return alunos;
    }

    public void setAlunos(LinkedList alunos) {
        this.alunos = alunos;
    }

  
    
}
