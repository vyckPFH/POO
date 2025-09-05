
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Academico aluno;
        Curso curso;
        Diciplina diciplina;
        Professor professor;
        Semestre semestre;
        Turma turma;

        LinkedList materias = new LinkedList<>();
        materias.add("Matematica");

        LinkedList alunos = new LinkedList<>();
        alunos.add("GUSTAVO");

        professor = new Professor("LP", 0, new Pessoa("roberta tbm", 123));
        diciplina = new Diciplina(professor, "Linguagem de programação");
        semestre = new Semestre(materias, professor);
        turma = new Turma(alunos, semestre);
        curso = new Curso(semestre, "Tecnico em TI");
        aluno = new Academico(new Pessoa("aluno", 321), turma, 0, curso);

        System.out.println(diciplina.getDiciplinaNome());

    }
}
