public class Aluno implements InterfaceAluno{

    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void matricular() {
        System.out.println("Aluno Matriculado!");
        
    }
    
}
