public class Diciplina {
    private Professor professor;
    private String diciplinaNome;

    public Diciplina(Professor professor, String diciplinaNome) {
        this.professor = professor;
        this.diciplinaNome = diciplinaNome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDiciplinaNome() {
        return diciplinaNome;
    }

    public void setDiciplinaNome(String diciplinaNome) {
        this.diciplinaNome = diciplinaNome;
    }
}
