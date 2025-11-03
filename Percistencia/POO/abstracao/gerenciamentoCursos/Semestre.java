
import java.util.LinkedList;

public class Semestre {
    private LinkedList diciplinasDoSemestre;
    private Professor professorResponsavel;

    public Semestre(LinkedList diciplinasDoSemestre, Professor professorResponsavel) {
        
        this.diciplinasDoSemestre = diciplinasDoSemestre;
        this.professorResponsavel = professorResponsavel;
    }

    
    public LinkedList getDiciplinasDoSemestre() {
        return diciplinasDoSemestre;
    }

    public void setDiciplinasDoSemestre(LinkedList diciplinasDoSemestre) {
        this.diciplinasDoSemestre = diciplinasDoSemestre;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

   

}
