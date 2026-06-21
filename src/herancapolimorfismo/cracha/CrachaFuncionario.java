package herancapolimorfismo.cracha;

public class CrachaFuncionario extends Cracha {
    protected String cargo;
    protected String dataAdmissao;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDataAdmissao(int m, int a) {
        this.dataAdmissao = String.format("%d/%d", m, a);
    }

    @Override
    public void imprimir() {
        System.out.format("FUNCIONARIO%nNome: %s%nCargo: %s%nAdmissao: %s%n", this.nome, this.cargo, this.dataAdmissao);
    }
}
