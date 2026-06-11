package src.construtores;

public class ContaCorrente {
    private String nomeTitular;
    private double saldoTotal;

    private static int qtdeContas = 0;

    public ContaCorrente(String nome) {
        this.nomeTitular = nome;

        qtdeContas++;
    }

    public ContaCorrente(String nome, double saldo) {
        this.nomeTitular = nome;
        this.saldoTotal = saldo;

        qtdeContas++;
    }

    public double getSaldo() {
        return this.saldoTotal;
    }

    public String getTitular() {
        return this.nomeTitular;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) return false;

        this.saldoTotal += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > this.saldoTotal) return false;

        this.saldoTotal -= valor;
        return true;
    }

    public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor) {
        if (de.sacar(valor)) {
            para.depositar(valor);

            return true;
        }

        return false;
    }

    public static int getQuantidadeContas() {
        return qtdeContas;
    }
}
