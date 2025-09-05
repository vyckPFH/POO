public class Professor {
    private String materia;
    private float salario;
    private Pessoa documentos;

    public Professor(String materia, float salario, Pessoa documentos) {
        this.materia = materia;
        this.salario = salario;
        this.documentos = documentos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Pessoa getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Pessoa documentos) {
        this.documentos = documentos;
    }

    
    

}
