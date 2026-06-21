package herancapolimorfismo.cracha;

public class CrachaEstudante extends Cracha {
    protected String curso;

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        System.out.format("ESTUDANTE%nNome: %s%nCurso: %s%n", this.nome, this.curso);
    }
}
